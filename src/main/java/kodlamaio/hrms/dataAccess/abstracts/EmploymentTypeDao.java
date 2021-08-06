package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmploymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentTypeDao extends JpaRepository<EmploymentType, Integer> {
}
