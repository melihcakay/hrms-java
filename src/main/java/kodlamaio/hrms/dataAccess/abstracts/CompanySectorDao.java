package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.CompanySector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanySectorDao extends JpaRepository<CompanySector, Integer> {
}
