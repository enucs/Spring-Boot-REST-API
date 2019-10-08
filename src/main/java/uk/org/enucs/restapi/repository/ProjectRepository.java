package uk.org.enucs.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uk.org.enucs.restapi.model.Project;

import java.util.List;

/**
 * The interface Project repository.
 */
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    /**
     * Find by country list.
     *
     * @param country the country
     * @return the list
     */
    @Query("FROM Project WHERE country = :country")
    List<Project> findByCountry(String country);

    /**
     * Find by currency list.
     *
     * @param currency the currency
     * @return the list
     */
    @Query("FROM Project WHERE currency = :currency")
    List<Project> findByCurrency(String currency);

    /**
     * Find percentage funded greater than list.
     *
     * @param percentage the percentage
     * @return the list
     */
    @Query("FROM Project WHERE percentageFunded > :percentage")
    List<Project> findPercentageFundedGreaterThan(int percentage);

    @Query("FROM Project WHERE percentageFunded < :percentage")
    List<Project> findPercentageFundedLessThan(int percentage);

    @Query("FROM Project WHERE type = :type")
    List<Project> findByType(String type);

    @Query("FROM Project WHERE state = :state")
    List<Project> findByState(String state);

    @Query("FROM Project WHERE location = :location")
    List<Project> findByLocation(String location);

    @Query("FROM Project WHERE title LIKE %:title%")
    List<Project> findAllWhereTitleContains(String title);

    @Query(value = "INSERT INTO Project (" +
            "id" +
            "amountPledged," +
            "blurb," +
            "by, " +
            "country, " +
            "currency, " +
            "endTime, " +
            "location, " +
            "percentageFunded, " +
            "state, " +
            "title, " +
            "type, " +
            "url) " +
            "VALUES (" +
            ":project.id" +
            ":project.amountPledged, " +
            ":project.blurb, " +
            ":project.by, " +
            ":project.country, " +
            ":project.currency, " +
            ":project.endTime, " +
            ":project.location, " +
            ":project.percentageFunded, " +
            ":project.state, " +
            ":project.title, " +
            ":project.type, " +
            ":project.url)", nativeQuery = true)
    void addNewProject(Project project);
}
