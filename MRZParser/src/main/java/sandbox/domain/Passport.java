package sandbox.domain;

//Object which holds all the passport info of a person 
public class Passport {

    //variables
    private String name;
    private String sex;
    private int dob;
    private int expiry;
    private int passportNumber;
    private String nationality;
    private String issuingState;
    private String extraInfo;
    private String mrz;

    //contructor for full passport object
 
    
    public Passport(String name, String sex, int dob, int expiry, int passportNumber,
            String nationality, String issuingState, String extraInfo, String mrz) {
        
        //checking for invalid inputs for passport values
        if(String.valueOf(dob).length() != 6) {
            throw new IllegalArgumentException("Dob should be 6 digits");
        }
        if(String.valueOf(expiry).length() != 6) {
            throw new IllegalArgumentException("Expiry should be 6 digits");
        }
        if(String.valueOf(passportNumber).length() != 9) {
            throw new IllegalArgumentException("PassportNumber should be 9 digits");
        }
        if(nationality.length() != 3) {
            throw new IllegalArgumentException("Nationality should be 3 characters long");
        }
        if(issuingState.length() != 3) {
            throw new IllegalArgumentException("IssuingState should be 3 characters long");
        }
        if(mrz.length() != 44) {
            throw new IllegalArgumentException("Mrz should be 44 characters long");
        }
        
        //assinging values
        
        this.name = name;
        this.sex = sex;
        this.dob = dob; //YYMMDD
        this.expiry = expiry; //YYMMDD
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.issuingState = issuingState;
        this.extraInfo = extraInfo;
        this.mrz = mrz;
    }

    //constructor for passport object, if given no name, sex, or extra info, as in the example
    public Passport(int dob, int expiry, int passportNumber,
            String nationality, String issuingState, String mrz) {
        
        
        //checking for invalid inputs for passport values
        
        if(String.valueOf(dob).length() != 6) {
            throw new IllegalArgumentException("Dob should be 6 digits");
        }
        if(String.valueOf(expiry).length() != 6) {
            throw new IllegalArgumentException("Expiry should be 6 digits");
        }
        if(String.valueOf(passportNumber).length() != 9) {
            throw new IllegalArgumentException("PassportNumber should be 9 digits");
        }
        if(nationality.length() != 3) {
            throw new IllegalArgumentException("Nationality should be 3 characters long");
        }
        if(issuingState.length() != 3) {
            throw new IllegalArgumentException("IssuingState should be 3 characters long");
        }
        if(mrz.length() != 44) {
            throw new IllegalArgumentException("Mrz should be 44 characters long");
        }
        
        //assinging values
        
        this.name = "";
        this.sex = "";
        this.dob = dob; //YYMMDD
        this.expiry = expiry; //YYMMDD
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.issuingState = issuingState;
        this.extraInfo = "";
        this.mrz = mrz;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getDob() {
        return dob;
    }

    public int getExpiry() {
        return expiry;
    }

    public int getPassportNumber() {
        return this.passportNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public String getIssuingState() {
        return issuingState;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public String getMrz() {
        return this.mrz;
    }
    
    public void setMrz(String newMrz) {
        this.mrz = newMrz;
    }
    
    public void setPassportNumber(int newPassportNumber) {
        this.passportNumber = newPassportNumber;
    }
    
    public void setSex(String newSex) {
        this.sex = newSex;
    }

}
