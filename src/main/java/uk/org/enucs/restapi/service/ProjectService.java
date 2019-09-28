package uk.org.enucs.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.org.enucs.restapi.repository.ProjectRepository;
import uk.org.enucs.restapi.model.Project;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    public Project findById(int id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.orElse(null);
    }

    public List<Project> findByCountry(String country) {
        return projectRepository.findByCountry(country);
    }

    public List<Project> findByCurrency(String currency) {
        return projectRepository.findByCurrency(currency);
    }
}
