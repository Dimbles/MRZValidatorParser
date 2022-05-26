
import com.beust.jcommander.*;

//package sandbox.mrzparser;
public class Args {

    @Parameter(
            names = "-dob",
            description = "Date of birth",
            required = true
    )
    private String dob;

    @Parameter(
            names = "-exp",
            description = "Expiry",
            required = true
    )
    private String exp;

    @Parameter(
            names = "-passportno",
            description = "Passport number",
            required = true
    )
    private String passportno;

    @Parameter(
            names = "-nationality",
            description = "Nationality",
            required = true
    )
    private String nationality;

    @Parameter(
            names = "-state",
            description = "Issuing State",
            required = true
    )
    private String state;

    @Parameter(
            names = "-mrzl2",
            description = "Line 2 of the machine readable zone, MRZ",
            required = true
    )
    private String mrzl2;
    
    //getters and setters 

    public String getDob() {
        return this.dob;
    }

    public String getExp() {
        return exp;
    }

    public String getPassportno() {
        return passportno;
    }

    public String getNationality() {
        return nationality;
    }

    public String getState() {
        return state;
    }

    public String getMrzl2() {
        return mrzl2;
    }

}
