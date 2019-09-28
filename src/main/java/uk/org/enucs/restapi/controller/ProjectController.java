package uk.org.enucs.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.org.enucs.restapi.model.Project;
import uk.org.enucs.restapi.service.ProjectService;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(value = "/projects")
    public List<Project> getAllProjects() {
        return projectService.findAllProjects();
    }

    @GetMapping(value = "/projects/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectService.findById(id);
    }

    @GetMapping(value = "/projects/country/{country}")
    public List<Project> getProjectsByCountry(@PathVariable String country) {
        return projectService.findByCountry(country);
    }

    @GetMapping(value = "/projects/currency/{currency}")
    public List<Project> getProjectsByCurrency(@PathVariable String currency) {
        return projectService.findByCurrency(currency);
    }
}
