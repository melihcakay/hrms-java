package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.PositionLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionLevelDao extends JpaRepository<PositionLevel, Integer> {
}
