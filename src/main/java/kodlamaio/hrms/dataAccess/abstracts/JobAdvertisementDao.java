package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    @Query("From JobAdvertisement  where isActive = true")
    List<JobAdvertisement> getAllByActive();

    @Query("From JobAdvertisement where isActive = true Order By createdDate ASC")
    List<JobAdvertisement> getAllByActiveSorted();

    JobAdvertisement getByIdAndEmployerId(int id, int employerId);
}
