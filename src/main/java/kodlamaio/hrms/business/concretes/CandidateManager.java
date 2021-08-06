package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.validations.CandidateValidation;
import kodlamaio.hrms.core.adapters.FakeMernisAdapter;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data listelendi.");
    }

    @Override
    public Result register(Candidate candidate) {
        if (CandidateValidation.validate(candidate)) {
            this.candidateDao.save(candidate);
            return new SuccessDataResult("Kayıt başarıyla yapıldı.");
        } else {
            return new ErrorDataResult("Kayıt tamamlanamadı.");
        }

    }
}