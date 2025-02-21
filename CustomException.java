//creating a new exception type 

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

public class CustomException {


    //method to check the age of the person
    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the age");
            int age = sc.nextInt();

            validateAge(age);
            System.out.println("Access Granted !!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
