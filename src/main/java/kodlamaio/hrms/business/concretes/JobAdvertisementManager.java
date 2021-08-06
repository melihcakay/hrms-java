package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private final JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessDataResult("İş ilanı başarıyla eklendi.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByActive() {
        return new SuccessDataResult<List<JobAdvertisement>>(
                this.jobAdvertisementDao.getAllByActive(), "Aktif iş ilanları listelendi."
        );
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByActiveSorted() {
        return new SuccessDataResult<List<JobAdvertisement>>(
                this.jobAdvertisementDao.getAllByActiveSorted(), "Aktif iş ilanları tarihe göre listelendi."
        );
    }

    @Override
    public Result changeAdvertisementStatus(int id, int employerId, boolean isActive) {
        JobAdvertisement advertisement = this.jobAdvertisementDao.getByIdAndEmployerId(id, employerId);
        advertisement.setActive(isActive);
        this.jobAdvertisementDao.save(advertisement);
        return new SuccessResult("İş ilanı durumu değiştirildi.");
    }


}
