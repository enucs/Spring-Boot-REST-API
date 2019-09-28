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
}
