import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //-------------------------------Exercise (Methods)-----------------------------
        /*System.out.print("Input the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Input the second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Input the third number: ");
        double thirdNumber= input.nextDouble();
        //-------------------------Ex1-Call method-------------------------------------
        System.out.println("The smallest value is " + findSmallest(firstNumber, secondNumber, thirdNumber) + ".");*/


        //-------------------------Ex2-Call method-------------------------------------
        /*System.out.print("Enter a number: ");
        double number = input.nextDouble();

        checkNumber(number);*/

        //-------------------------Ex3-Call method-------------------------------------

        System.out.println("Password rules:\n" +
                "1. A password must have at least eight characters." +
                "\n2. A password consists of only letters and digits." +
                "\n3. A password must contain at least two digits." +
                "\n4. A password must contain both letters and digits.");

        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Invalid password.");
        }




    }


    //----------------------------------------------------1-----------------------------------------------------
    /* - Write a Java method to find the smallest number among three numbers.
    Test Data:*/
    public static double findSmallest(double firstnumber, double secondnumber, double thirdnumber) {
        double smallest = firstnumber;

        if (secondnumber < smallest) {
            smallest = secondnumber;
        }

        if (thirdnumber < smallest) {
            smallest = thirdnumber;
        }
        return smallest;
    }


    //----------------------------------------------------2-----------------------------------------------------
    /* 2-Write a Java method that check if the entered number is
      negative or positive or zero.*/


    public static void checkNumber(double number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }


    //----------------------------------------------------3-----------------------------------------------------
    /* 3 - Write a Java method to check whether a string is a valid password.
    Password rules:
   //A password must have at least ten characters.
   A password consists of only letters and digits.
   A password must contain at least two digits*/


    public static boolean isPasswordValidLength(String password) {
        // Rule 1: Password must have at least ten characters.
        return password.length() >= 8;
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean containsOnlyLettersAndDigits = true;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                containsOnlyLettersAndDigits = false;
                break;
            }
        }
        if (!containsOnlyLettersAndDigits) {
            return false;
        }

        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            return false;
        }
        boolean containsLetters = false;
        boolean containsDigits = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                containsLetters = true;
            } else if (Character.isDigit(c)) {
                containsDigits = true;
            }
        }

        return containsLetters && containsDigits;
    }
}
