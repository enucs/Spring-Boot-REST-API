package uk.org.enucs.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.org.enucs.restapi.model.Project;
import uk.org.enucs.restapi.service.ProjectService;

import java.util.List;

/**
 * The type Project controller.
 */
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * Gets all projects.
     *
     * @return the all projects
     */
    @GetMapping(value = "/projects")
    public List<Project> getAllProjects() {
        return projectService.findAllProjects();
    }

    @PostMapping(value = "/projects")
    public void addNewProject(@RequestBody Project project) {
        projectService.addNewProject(project);
    }

    /**
     * Gets project by id.
     *
     * @param id the id
     * @return the project by id
     */
    @GetMapping(value = "/projects/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectService.findById(id);
    }

    /**
     * Gets projects by country.
     *
     * @param country the country
     * @return the projects by country
     */
    @GetMapping(value = "/projects/country/{country}")
    public List<Project> getProjectsByCountry(@PathVariable String country) {
        return projectService.findByCountry(country);
    }

    /**
     * Gets projects by currency.
     *
     * @param currency the currency
     * @return the projects by currency
     */
    @GetMapping(value = "/projects/currency/{currency}")
    public List<Project> getProjectsByCurrency(@PathVariable String currency) {
        return projectService.findByCurrency(currency);
    }

    /**
     * Gets projects with funded more than.
     *
     * @param percentage the percentage
     * @return the projects with funded more than
     */
    @GetMapping(value = "/projects/funded/greater-than", params = "percentage")
    public List<Project> getProjectsWithFundedMoreThan(@RequestParam int percentage) {
        return projectService.findPercentageFundedGreaterThan(percentage);
    }

    /**
     * Gets projects with funded less than.
     *
     * @param percentage the percentage
     * @return the projects with funded less than
     */
    @GetMapping(value = "/projects/funded/less-than", params = "percentage")
    public List<Project> getProjectsWithFundedLessThan(@RequestParam int percentage) {
        return projectService.findPercentageFundedLessThan(percentage);
    }

    @GetMapping(value = "/projects/type/{type}")
    public List<Project> findByType(@PathVariable String type) {
        return projectService.findByType(type);
    }

}
