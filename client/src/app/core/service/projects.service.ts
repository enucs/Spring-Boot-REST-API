import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { responsiveMap } from 'ng-zorro-antd';
import { Project } from 'src/app/shared/models/project';

@Injectable({
  providedIn: 'root'
})
export class ProjectsService {

  constructor(private http: HttpClient) { }

  private _allProjects = '/projects';

  getAllProjects(): Observable<any> {
    return this.http.get(this._allProjects)
      .pipe(
        map((response: Project) => response)
      );
  }
}
