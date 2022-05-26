
package sandbox.logic;

import sandbox.domain.MRZ;
import sandbox.domain.Passport;
 
public class MrzValidation {
    private Passport passport;
    private MRZ mrz;
    
    public MrzValidation( Passport passport, MRZ mrz) {
        this.passport = passport;
        this.mrz = mrz;
    }
    
    public String validationTest() {
        
        String returnString = "";
        
        while(true) {
            
            //going through the various checks of the mrz and seeing if any fail
            
            //checking lenght of mrz
            if( mrz.checkLength() ) {
                returnString += "Valid MRZ length" + "\n";
            } else {
                returnString += "Invalid MRZ length" + "\n";
                break;
            }
            
            //checking passport number
            if( mrz.checkPassportNumber() ) {
                returnString += "Valid passport number" + "\n";
            } else {
                returnString += "Invalid passport number" + "\n";
                break;
            }
            
            //checking first checkdigit
            if( mrz.checkCheckDigitFirst() ) {
                returnString += "Valid first check digit" + "\n";
            } else {
                returnString += "Invalid first check digit" + "\n";
                break;
            }
            
            //checking nationality
            if( mrz.checkNationality() ) {
                returnString += "Valid nationality" + "\n";
            } else {
                returnString += "Invalid nationality" + "\n";
                break;
            }
            
            //checking dob
            if( mrz.checkDob() ) {
                returnString += "Valid dob" + "\n";
            } else {
                returnString += "Invalid dob" + "\n";
                break;
            }
            
            //checking second checkdigit
            if( mrz.checkCheckDigitSecond() ) {
                returnString += "Valid second check digit" + "\n";
            } else {
                returnString += "Invalid second check digit" + "\n";
                break;
            }
            
            //checking sex
            if( mrz.checkSex() ) {
                returnString += "Valid sex" + "\n";
            } else {
                returnString += "Invalid sex" + "\n";
                break;
            }
            
            //checking expiry
            if( mrz.checkExpiry() ) {
                returnString += "Valid expiry" + "\n";
            } else {
                returnString += "Invalid expiry" + "\n";
                break;
            }
            
            //checking third checkdigit
            if( mrz.checkCheckDigitThird() ) {
                returnString += "Valid third check digit" + "\n";
            } else {
                returnString += "Invalid third check digit" + "\n";
                break;
            }
            
            //checking fourth checkdigit
            if( mrz.checkCheckDigitFourth() ) {
                returnString += "Valid fourth check digit" + "\n";
            } else {
                returnString += "Invalid fourth check digit" + "\n";
                break;
            }
            
            //checking fifth checkdigit
            if( mrz.checkCheckDigitFifth() ) {
                returnString += "Valid fifth check digit" + "\n";
            } else {
                returnString += "Invalid fifth check digit" + "\n";
                break;
            }
            
            returnString += "All validation checks performed and returned succesful" + "\n";
            returnString += "MRZ is valid for this passport" + "\n";
            break;
            
        }
        
        //System.out.println(returnString);
        return returnString;
        
    }
    
}
