package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;

import java.util.List;

public interface CurriculumVitaeService {

    Result add(CurriculumVitae curriculumVitae);

    DataResult<List<CurriculumVitaeWithCandidateDto>> getCurriculumVitaeWithCandidateDetails();

    DataResult<CurriculumVitae> getByCandidate_NationalIdAndCandidate_FirstName(String nationalId,String firstName);
}
