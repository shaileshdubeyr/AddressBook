package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidator {

    public static boolean validateDetails(String guysWithMe, String matcherWithRejex,String pattern) {

        switch(pattern){
            case "EMAIL_PATTERN":
                boolean forTestEmail = Pattern.matches(guysWithMe, matcherWithRejex);
                return forTestEmail;
            case "FIRST_NAME_PATTERN":
                boolean forTestFirstName = Pattern.matches(guysWithMe, matcherWithRejex);
                return forTestFirstName;
            case "LAST_NAME_PATTERN":
                boolean forTestLastName = Pattern.matches(guysWithMe, matcherWithRejex);
                return forTestLastName;
            case "MOBILE_NO_PATTERN":
                boolean forTestmobileNumber = Pattern.matches(guysWithMe, matcherWithRejex);
                return forTestmobileNumber;
            case "PASSWORD_PATTERN":
                boolean forTestPassword = Pattern.matches(guysWithMe, matcherWithRejex);
                return forTestPassword;
            default:
                System.out.println("invalid input");
                return false;
        }
    }

   /* public boolean firstName(String firstName) {
        try {
            boolean mathPattern = Pattern.matches(usr.FIRST_NAME_PATTERN, firstName);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }

    public boolean lastName(String lastName) {
        try {
            boolean mathPattern = Pattern.matches(LAST_NAME_PATTERN, lastName);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input lastName is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }

    public boolean mobileNumber(String mobileNumber) {
        try {
            boolean mathPattern = Pattern.matches(MOBILE_NO_PATTERN, mobileNumber);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input number is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }

    public boolean passwordTest(String password) {
        try {
            boolean mathPattern = Pattern.matches(PASSWORD_PATTERN, password);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input for password is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }
    public boolean gmailTest(String email) {
        try {
            boolean mathPattern = Pattern.matches(EMAIL_PATTERN, email);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input Email is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }*/
}
