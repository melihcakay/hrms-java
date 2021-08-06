package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmploymentTypeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmploymentTypeDao;

import kodlamaio.hrms.entities.concretes.EmploymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymentTypeManager implements EmploymentTypeService {

    private final EmploymentTypeDao employmentTypeDao;

    @Autowired
    public EmploymentTypeManager(EmploymentTypeDao employmentTypeDao) {
        this.employmentTypeDao = employmentTypeDao;
    }


    @Override
    public Result add(EmploymentType employmentType) {
        return new SuccessDataResult(this.employmentTypeDao.save(employmentType), "added.");
    }

    @Override
    public DataResult<List<EmploymentType>> getAll() {
        return new SuccessDataResult<List<EmploymentType>>(this.employmentTypeDao.findAll(), "data listed.");
    }
}
