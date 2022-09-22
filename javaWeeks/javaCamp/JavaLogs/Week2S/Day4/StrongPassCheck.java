import java.util.Scanner;

public class StrongPassCheck{
    public static int passwordLengthIsValid(String password){
        //Gives points whether or not password is valid:
        int getPassLength = password.length();
        if( getPassLength > 8 && getPassLength < 20){
            return 1;
        }
        else{
            System.out.println("Invalid Length");
            return 0;
        }
    }
    public static void passwordIsValid(String password){
        boolean passwordHasCapital = false;
        boolean passwordHasLower = false;
        boolean passwordLength = false;
        boolean passwordHasDigit = false;
        
        int getPassLength = password.length();

        if( getPassLength > 8 && getPassLength < 20){
            //Verifies Password Length
            passwordLength = true;
        }

        for(int i = 0; i < password.toCharArray().length; i++){
            if(Character.isUpperCase(password.charAt(i))){
                //Verifies Capital Requirement
                passwordHasCapital = true;
            }
            else if(Character.isLowerCase(password.charAt(i))){
                //Verifies Lowercase Requirement
                passwordHasLower = true;
            }else if(Character.isDigit(password.charAt(i))){
                //Verifies Digit Requirement
                passwordHasDigit = true;

            }
        }
        if(passwordHasCapital && passwordHasLower && passwordHasDigit && passwordLength){
            String passwordVerified = password;
            System.out.println("The password: " + passwordVerified + " is strong");
        }else{
            System.out.println("Password is weak, please enter in a new password");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a password for your username: \nPassword has at least 6 characters and at most 20 characters.\nPassword contains at least one lowercase letter, at least one uppercase letter, and at least one digit.\nPassword  does not contain three repeating characters in a row (i.e., ...aaa... is weak, but ...aa...a... is strong, assuming other condPasswordions are met).\n");
        String password = scan.next();
        passwordIsValid(password);

    }
}