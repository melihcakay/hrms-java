package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CompanySectorService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CompanySector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companysectors")
@CrossOrigin
public class CompanySectorsController {

    private CompanySectorService companySectorService;

    @Autowired
    public CompanySectorsController(CompanySectorService companySectorService) {
        this.companySectorService = companySectorService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CompanySector companySector) {
        return this.companySectorService.add(companySector);
    }

    @GetMapping("/getall")
    public DataResult<List<CompanySector>> getAll(){
        return this.companySectorService.getAll();
    }
}
