package repository;

import model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jakub on 24.02.2017.
 */
public interface ConferenceRepository extends JpaRepository<Conference, Long> {

}
