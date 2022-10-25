
/**
 * Write a description of class Username here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number:");
    String favNum = s.nextLine();
    System.out.print("Are you a teacher or a student:");
    String role = s.nextLine().toLowerCase();
    System.out.print("How long do you want your password to be: ");
    int num = input.nextInt();
    
    
    // test output
    if (role.equals("student")){ 
        System.out.println("Hello " + (firstName)  + getInitial(lastName) + favNum + "@nycstudents.net");
    }// end of if 
    else if(role.equals("teacher")){
        System.out.println("Hello " + getInitial(firstName) + (lastName) + favNum + "@school.nyc.gov");
    }// end of else if

    else {
        System.out.println("Enter a valid answer");
    }// end of else
    s.close();
    generatePassword(num);
  } // end main method 
  /*
   * Name: generatePassword
   * Purpose: send back a random String of numbers, upper/lower letters
   * Input: length of password 
   * Return: string
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method
  public static String generatePassword(int length) { 
    
    String password = "";
    for(int i = 0; i < length; i++){
        int rand1 = (char)(int)(Math.random() * (90-65+1) +65);
        int rand2 = (char)(int)(Math.random() * (122-97+1) + 97);
        int rand3 =(char)(int)(Math.random() * (65+47+1) + 47);
        char a = (char)rand1;
        char b = (char)rand2;
        char c = (char)rand3;
        
        password += a;
        System.out.print(password);
    }// end for loop 
    return password;
    //generate a random number 
    // 97 - 122 lower case
    // 33-47 special symbols
    //65-90 capital letter
    // convernt interger to char
    }// end generatePassword
} // end class
    