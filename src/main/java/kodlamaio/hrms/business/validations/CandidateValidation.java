package kodlamaio.hrms.business.validations;

import kodlamaio.hrms.core.adapters.FakeMernisAdapter;
import kodlamaio.hrms.entities.concretes.Candidate;

public class CandidateValidation {

    public static boolean validate(Candidate candidate) {
        if (FakeMernisAdapter.validate(candidate.getNationalId()) &&
                EmailValidation.validate(candidate)) {
            return true;
        } else {
            return false;
        }
    }
}
