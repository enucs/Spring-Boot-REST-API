package uk.org.enucs.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uk.org.enucs.restapi.model.Project;

import java.util.List;


public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Query("FROM Project WHERE country = :country")
    List<Project> findByCountry(String country);

    @Query("FROM Project WHERE currency = :currency")
    List<Project> findByCurrency(String currency);
}
