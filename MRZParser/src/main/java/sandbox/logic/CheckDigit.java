package sandbox.logic;

import java.util.ArrayList;

public class CheckDigit {

    private String mrz;

    public CheckDigit(String mrz) {
        this.mrz = mrz;
    }

    //checking if a string is a number
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    //converting char A-Z into int value for checkdigit calculation
    public int calcCharValue(char character) {
        //1-9 = 1-9

        //A = 10, B = 11, etc...
        int value = character - 'A' + 10;
        return value;
    }

    //calculates checkdigit using values between start and end in mrz
    //a symbol of "<" counts as 0 in this program
    public int calcCheckDigitSum(String mrz, int start, int end) {

        //getting substring of mrz that are using to calculate check digit
        String subMrz = mrz.substring(start, end);
        //System.out.println("subMrz: " + subMrz);
        //converting substring characters to numbers according to formula
        //and placing in an arrayList
        ArrayList<Integer> valuesArray = new ArrayList<>();

        for (int i = 0; i < subMrz.length() ; i++) {
            if (!this.isNumeric(String.valueOf(subMrz.charAt(i)))) {
                if( subMrz.charAt(i) == '<') {
                    
                } else {
                int numberValue = calcCharValue(subMrz.charAt(i));
                valuesArray.add(numberValue);
                }
            } else {
                String stringSlice = String.valueOf(subMrz.charAt(i));
                int numberValue = Integer.valueOf(stringSlice);
                valuesArray.add(numberValue);

            }
        }

        //creating array of weights to use in calculation
        ArrayList<Integer> weights = new ArrayList<>();
        weights.add(7);
        weights.add(3);
        weights.add(1);

        //finding legth with which to calculate the checkDigit
        int length = valuesArray.size();
        int sum = 0;

        for (int i = 0; i  < length; i++) {
            //System.out.println("valuesArray: " + valuesArray.get(i));
            int weight = weights.get(i % 3);

            sum += weight * valuesArray.get(i);
        }
        
        return sum % 10;

    }

}
