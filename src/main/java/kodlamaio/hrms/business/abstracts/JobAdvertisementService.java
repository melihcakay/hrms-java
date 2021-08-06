package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {
    Result add(JobAdvertisement jobAdvertisement);

    DataResult<List<JobAdvertisement>> getAllByActive();

    DataResult<List<JobAdvertisement>> getAllByActiveSorted();

        public Result changeAdvertisementStatus(int id, int employerId, boolean isActive);
}
