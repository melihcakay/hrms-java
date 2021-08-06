package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.PositionLevelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.PositionLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positionLevels")
@CrossOrigin
public class PositionLevelsController {

    private PositionLevelService positionLevelService;

    @Autowired
    public PositionLevelsController(PositionLevelService positionLevelService) {
        this.positionLevelService = positionLevelService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody PositionLevel positionLevel) {
        return this.positionLevelService.add(positionLevel);
    }

    @GetMapping("/getall")
    public DataResult<List<PositionLevel>> getAll(){
        return this.positionLevelService.getAll();
    }
}
