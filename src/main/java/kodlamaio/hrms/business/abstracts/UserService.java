package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.entities.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();


}
