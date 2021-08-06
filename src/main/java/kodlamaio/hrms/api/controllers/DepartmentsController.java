package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin
public class DepartmentsController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentsController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Department department) {
        return this.departmentService.add(department);
    }

    @GetMapping("getall")
    public DataResult<List<Department>> getAll(){
        return this.departmentService.getAll();
    }
}
