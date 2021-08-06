package kodlamaio.hrms.core.adapters;

import kodlamaio.hrms.services.FakeMernis;

public class FakeMernisAdapter {

    public static boolean validate(String nationalId) {

        return FakeMernis.validate(nationalId);

    }
}
