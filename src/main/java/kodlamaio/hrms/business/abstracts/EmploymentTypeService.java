package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmploymentType;

import java.util.List;

public interface EmploymentTypeService {
    Result add(EmploymentType employmentType);

    DataResult<List<EmploymentType>> getAll();
}
