package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculumVitaes")
@CrossOrigin
public class CurriculumVitaesController {

    private CurriculumVitaeService curriculumVitaeService;

    @Autowired
    public CurriculumVitaesController(CurriculumVitaeService curriculumVitaeService) {
        this.curriculumVitaeService = curriculumVitaeService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CurriculumVitae curriculumVitae) {
        return this.curriculumVitaeService.add(curriculumVitae);
    }

    @GetMapping("/getCurriculumVitaeWithCandidateDetails")
    public DataResult<List<CurriculumVitaeWithCandidateDto>> getCurriculumVitaeWithCandidateDetails() {
        return this.curriculumVitaeService.getCurriculumVitaeWithCandidateDetails();
    }

    @GetMapping("/getByCandidate_NationalIdAndCandidate_FirstName")
    public DataResult<CurriculumVitae> getByCandidate_NationalIdAndCandidate_FirstName(@RequestParam String nationalId,@RequestParam String firstName) {
        return this.curriculumVitaeService.getByCandidate_NationalIdAndCandidate_FirstName(nationalId, firstName);
    }

}
