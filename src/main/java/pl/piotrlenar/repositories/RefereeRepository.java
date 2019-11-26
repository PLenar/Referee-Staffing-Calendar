package pl.piotrlenar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrlenar.entities.Referee;

public interface RefereeRepository extends JpaRepository<Referee, Long> {
}
