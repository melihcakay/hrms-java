package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {

    private CurriculumVitaeDao curriculumVitaeDao;

    @Autowired
    public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
        this.curriculumVitaeDao = curriculumVitaeDao;
    }


    @Override
    public Result add(CurriculumVitae curriculumVitae) {
        this.curriculumVitaeDao.save(curriculumVitae);
        return new SuccessDataResult("CV başarıyla eklendi.");
    }

    @Override
    public DataResult<List<CurriculumVitaeWithCandidateDto>> getCurriculumVitaeWithCandidateDetails() {
        return new SuccessDataResult<List<CurriculumVitaeWithCandidateDto>>(
                this.curriculumVitaeDao.getCurriculumVitaeWithCandidateDetails(), "Data listelendi."
        );
    }

    @Override
    public DataResult<CurriculumVitae> getByCandidate_NationalIdAndCandidate_FirstName(String nationalId, String firstName) {
        return new SuccessDataResult<CurriculumVitae>(
                this.curriculumVitaeDao.getByCandidate_NationalIdAndCandidate_FirstName(nationalId, firstName),"Data listelendi."
        );
    }

}
