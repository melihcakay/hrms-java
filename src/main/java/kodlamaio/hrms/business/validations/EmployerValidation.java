package kodlamaio.hrms.business.validations;

import kodlamaio.hrms.entities.concretes.Employer;

public class EmployerValidation {

    public static boolean validate(Employer employer) {
        if (EmailValidation.validate(employer) &&
                EmployerActivationValidation.validate(employer)
        ) {
            return true;
        } else {
            return false;
        }
    }
}
