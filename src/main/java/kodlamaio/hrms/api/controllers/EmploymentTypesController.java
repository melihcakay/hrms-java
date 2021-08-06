package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmploymentTypeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmploymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employmentTypes")
@CrossOrigin
public class EmploymentTypesController {

    private EmploymentTypeService employmentTypeService;

    @Autowired
    public EmploymentTypesController(EmploymentTypeService employmentTypeService) {
        this.employmentTypeService = employmentTypeService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody EmploymentType employmentType) {
        return this.employmentTypeService.add(employmentType);
    }

    @GetMapping("/getall")
    public DataResult<List<EmploymentType>> getAll(){
        return this.employmentTypeService.getAll();
    }
}
