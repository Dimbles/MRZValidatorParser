
import com.beust.jcommander.*;

import sandbox.domain.Passport;
import sandbox.domain.MRZ;
import sandbox.logic.MrzValidation;

//package sandbox.mrzparser;


public class MRZParser {

    public static void main(String[] args) {
        
        Args jArgs = new Args();
        JCommander helloCmd = JCommander.newBuilder()
                .addObject(jArgs)
                .build();
        helloCmd.parse(args);
        
        //testing out the parsing with a print statement
//        System.out.println("Dob: " + jArgs.getDob());
//        
//        System.out.println("Exp: " + jArgs.getExp());
//        
//        System.out.println("Passportno: " + jArgs.getPassportno());
//        
//        System.out.println("nationality: " + jArgs.getNationality());
//        
//        System.out.println("state: " + jArgs.getState());
//        
//        System.out.println("mrzl2: " + jArgs.getMrzl2());
        
        //running old program with the parser 
        
        Passport passport = new Passport( Integer.valueOf(jArgs.getDob()), Integer.valueOf(jArgs.getExp()), Integer.valueOf(jArgs.getPassportno()),
                jArgs.getNationality(), jArgs.getState(), jArgs.getMrzl2());

        MRZ mrz = new MRZ(passport);

        MrzValidation validation = new MrzValidation(passport, mrz);

        //validating the MRZ of the given passport
        String validationResult = validation.validationTest();

        System.out.println(validationResult);
        
    }
}
