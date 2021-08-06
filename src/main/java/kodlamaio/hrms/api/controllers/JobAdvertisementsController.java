package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisements")
@CrossOrigin
public class JobAdvertisementsController {

    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @PostMapping("/add")
    Result add(@RequestBody JobAdvertisement jobAdvertisement) {
        return this.jobAdvertisementService.add(jobAdvertisement);
    }

    @PutMapping("/changeAdvertisementStatus")
    public Result changeAdvertisementStatus(@RequestParam int id, int employerId, boolean isActive) {
        return this.jobAdvertisementService.changeAdvertisementStatus(id, employerId, isActive);
    }

    @GetMapping("/getAllByActive")
    public DataResult<List<JobAdvertisement>> getAllByActive() {
        return this.jobAdvertisementService.getAllByActive();
    }

    @GetMapping("/getAllByActiveSorted")
    public DataResult<List<JobAdvertisement>> getAllByActiveSorted() {
        return this.jobAdvertisementService.getAllByActiveSorted();
    }
}
