package uk.org.enucs.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.org.enucs.restapi.model.Project;
import uk.org.enucs.restapi.repository.ProjectRepository;

import java.util.List;
import java.util.Optional;

/**
 * The type Project service.
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    /**
     * Find all projects list.
     *
     * @return the list
     */
    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    /**
     * Find by id project.
     *
     * @param id the id
     * @return the project
     */
    public Project findById(int id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.orElse(null);
    }

    /**
     * Find by country list.
     *
     * @param country the country
     * @return the list
     */
    public List<Project> findByCountry(String country) {
        return projectRepository.findByCountry(country);
    }

    /**
     * Find by currency list.
     *
     * @param currency the currency
     * @return the list
     */
    public List<Project> findByCurrency(String currency) {
        return projectRepository.findByCurrency(currency);
    }

    /**
     * Find percentage funded greater than list.
     *
     * @param percentage the percentage
     * @return the list
     */
    public List<Project> findPercentageFundedGreaterThan(int percentage) {
        return projectRepository.findPercentageFundedGreaterThan(percentage);
    }

    public List<Project> findPercentageFundedLessThan(int percentage) {
        return projectRepository.findPercentageFundedLessThan(percentage);
    }

    public List<Project> findByType(String type) {
        return projectRepository.findByType(type);
    }

    public List<Project> findByState(String state) {
        return projectRepository.findByState(state);
    }

    public List<Project> findByLocation(String location) {
        return  projectRepository.findByLocation(location);
    }

    public List<Project> findAllWhereTitleContains(String title) {
        return projectRepository.findAllWhereTitleContains(title);
    }

    public void addNewProject(Project project) {
        projectRepository.addNewProject(project);
    }
}
