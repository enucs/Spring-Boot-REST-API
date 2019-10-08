import { Component, OnInit, Input } from '@angular/core';
import { ProjectsService } from 'src/app/core/service/projects.service';
import { Project } from '../../models/project';

@Component({
  selector: 'app-project-table',
  templateUrl: './project-table.component.html',
  styleUrls: ['./project-table.component.scss']
})
export class ProjectTableComponent implements OnInit {

  constructor(private projectService: ProjectsService) { }

  /** The title of the table. */
  @Input() tableTitle: string;
  /** The project data to display. */
  dataSet: any[] = [];

  /**
   *
   * @memberof ProjectTableComponent
   */
  ngOnInit() {
    this.tableTitle = 'All Projects';
    this.getAllProjects();
  }

  /**
   *
   * @memberof ProjectTableComponent
   */
  getAllProjects(): void {
    this.projectService.getAllProjects()
      .subscribe((response: Project[]) => {
        console.log(response);
        response.forEach(project => {
          this.dataSet = [...this.dataSet, project];
        });
    });
  }
}
