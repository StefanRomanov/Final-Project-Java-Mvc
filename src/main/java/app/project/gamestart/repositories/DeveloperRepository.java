package app.project.gamestart.repositories;

import app.project.gamestart.domain.entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer,String> {
}
