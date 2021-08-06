package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.PositionLevel;

import java.util.List;

public interface PositionLevelService {
    Result add(PositionLevel positionLevel);

    DataResult<List<PositionLevel>> getAll();
}
