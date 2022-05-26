package sandbox.domain;

import sandbox.logic.CheckDigit;

///class which inspects the mrz of a given passport and validates if it is correct
public class MRZ {

    private Passport passport;

    //contructors
    public MRZ(Passport passport) {
        this.passport = passport;
    }

    //getters and setters
    public Passport getPassport() {
        return this.passport;
    }

    //validating various parts of the MRZ
    //assuming that the various passport values are valid
    //as this would have been checked when the passport object was created
    
    //validating length of MRZ (should be 44 chars) 
    public boolean checkLength() {
        if (this.passport.getMrz().length() == 44) {
            return true;
        } else {
            return false;
        }

    }

    //passport number 
    //checking that first 9 digits of the mrz are equal to the passport number
    public boolean checkPassportNumber() {
        String mrz = this.passport.getMrz();
        String passportNumberMrz = mrz.substring(0, 9);
        int passportNum = Integer.valueOf(passportNumberMrz);
        if (this.passport.getPassportNumber() == passportNum) {
            return true;
        } else {
            return false;
        }
    }

    //check digit (1-9)
    public boolean checkCheckDigitFirst() {
        //check digit for range 1-9
        String mrz = this.passport.getMrz();
        CheckDigit checkDigit = new CheckDigit(mrz);

        int checkModulo = checkDigit.calcCheckDigitSum(mrz, 0, 9);

        int checkDigitOneMrz = Integer.valueOf(String.valueOf(mrz.charAt(9)));

        if (checkModulo == checkDigitOneMrz) {
            return true;
        } else {
            return false;
        }

    }

    //nationality 
    //checking that the character 11-13 are equal to the nationality code
    public boolean checkNationality() {
        String mrz = this.passport.getMrz();
        String nationalityMrz = mrz.substring(10, 13);
        if (this.passport.getNationality().equals(nationalityMrz)) {
            return true;
        } else {
            return false;
        }
    }
    

    //dob
    //checking that numbers 14-19 equal the dob
    public boolean checkDob() {
        String mrz = this.passport.getMrz();
        String dobMrz = mrz.substring(13, 19);
        int dobMrzInt = Integer.valueOf(dobMrz);
        if (this.passport.getDob() == dobMrzInt) {
            return true;
        } else {
            return false;
        }
    }

    //check digit (14-19)
    public boolean checkCheckDigitSecond() {
        //check digit for range 14-19
        String mrz = this.passport.getMrz();
        CheckDigit checkDigit = new CheckDigit(mrz);


        int checkModulo = checkDigit.calcCheckDigitSum(mrz, 13, 19);

        int checkDigitOneMrz = Integer.valueOf(String.valueOf(mrz.charAt(19)));

        if (checkModulo == checkDigitOneMrz) {
            return true;
        } else {
            return false;
        }

    }

    //sex
    //checking for correct char, M or F, if sex is specified, digit 21
    public boolean checkSex() {
        String mrz = this.passport.getMrz();
        String sexMrz = String.valueOf(mrz.charAt(20));
        //if unspecified, mrz should equal "<"
        if (this.passport.getSex().equals("")) {
            if (sexMrz.equals("<")) {
                return true;
            } else {
                return false;
            }
        } else if (this.passport.getSex().equals(sexMrz)) {
            return true;
        } else {
            return false;
        }
    }

    //expiry date 
    //checking that digits 22-27 equal the expiration date
    public boolean checkExpiry() {
        String mrz = this.passport.getMrz();
        String expiryMrz = mrz.substring(21, 27);
        int expiryMrzInt = Integer.valueOf(expiryMrz);
        if (this.passport.getExpiry() == expiryMrzInt) {
            return true;
        } else {
            return false;
        }
    }

    //check digit (22-27)
    public boolean checkCheckDigitThird() {
        //check digit for range 22-27
        String mrz = this.passport.getMrz();
        CheckDigit checkDigit = new CheckDigit(mrz);


        int checkModulo = checkDigit.calcCheckDigitSum(mrz, 21, 27);


        int checkDigitOneMrz = Integer.valueOf(String.valueOf(mrz.charAt(27)));

        if (checkModulo == checkDigitOneMrz) {
            return true;
        } else {
            return false;
        }

    }

    //personal number 
    //this number could be anything, and could contain chars and ints
    //not sure if I can check for this
    
    //check digit (29-42)
    public boolean checkCheckDigitFourth() {
        //check digit for range 29-42
        String mrz = this.passport.getMrz();
        CheckDigit checkDigit = new CheckDigit(mrz);

        int checkModulo = checkDigit.calcCheckDigitSum(mrz, 28, 42);


        int checkDigitOneMrz = Integer.valueOf(String.valueOf(mrz.charAt(42)));
;

        if (checkModulo == checkDigitOneMrz) {
            return true;
        } else {
            return false;
        }

    }

    //check digit (1-10, 14-20, 22-43)
    public boolean checkCheckDigitFifth() {
        //check digit for range 1-9
        String mrz = this.passport.getMrz();
        CheckDigit checkDigit = new CheckDigit(mrz);

        //creating string to run checkDigit over 
        String checkDigitString = mrz.substring(0, 10) + mrz.substring(13, 20) + mrz.substring(21, 43);

        int checkModulo = checkDigit.calcCheckDigitSum(checkDigitString, 0, checkDigitString.length());

        int checkDigitOneMrz = Integer.valueOf(String.valueOf(mrz.charAt(43)));

        if (checkModulo == checkDigitOneMrz) {
            return true;
        } else {
            return false;
        }

    }
}
