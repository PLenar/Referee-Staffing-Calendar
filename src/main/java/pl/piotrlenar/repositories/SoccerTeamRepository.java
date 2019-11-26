package pl.piotrlenar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrlenar.entities.SoccerTeam;

public interface SoccerTeamRepository extends JpaRepository<SoccerTeam, Long> {
}
