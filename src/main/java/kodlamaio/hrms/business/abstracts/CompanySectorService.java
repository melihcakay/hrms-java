package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CompanySector;

import java.util.List;

public interface CompanySectorService
{
    Result add(CompanySector companySector);

    DataResult<List<CompanySector>> getAll();
}
