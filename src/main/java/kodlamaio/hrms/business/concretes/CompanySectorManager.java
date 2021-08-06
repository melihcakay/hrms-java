package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CompanySectorService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CompanySectorDao;
import kodlamaio.hrms.entities.concretes.CompanySector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanySectorManager implements CompanySectorService {

    private CompanySectorDao companySectorDao;

    @Autowired
    public CompanySectorManager(CompanySectorDao companySectorDao) {
        this.companySectorDao = companySectorDao;
    }

    @Override
    public Result add(CompanySector companySector) {
        return new SuccessDataResult(this.companySectorDao.save(companySector), "added.");
    }

    @Override
    public DataResult<List<CompanySector>> getAll() {
        return new SuccessDataResult<List<CompanySector>>(this.companySectorDao.findAll(), "data listed.");
    }
}
