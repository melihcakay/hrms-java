package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PositionLevelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.PositionLevelDao;
import kodlamaio.hrms.entities.concretes.PositionLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionLevelManager implements PositionLevelService {

    private final PositionLevelDao positionLevelDao;

    @Autowired
    public PositionLevelManager(PositionLevelDao positionLevelDao) {
        this.positionLevelDao = positionLevelDao;
    }

    @Override
    public Result add(PositionLevel positionLevel) {
        return new SuccessDataResult(this.positionLevelDao.save(positionLevel), "added.");
    }

    @Override
    public DataResult<List<PositionLevel>> getAll() {
        return new SuccessDataResult<List<PositionLevel>>(this.positionLevelDao.findAll(),"data listed.");
    }
}
