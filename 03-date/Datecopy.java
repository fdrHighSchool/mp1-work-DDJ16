
/**
 * Write a description of class Datecopy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Datecopy
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        System.out.println("Enter the month");
        System.out.println("Enter the day of the month");
        System.out.println("Enter the year");

        
        String day = s.nextLine();
        System.out.println("Enter the day of the week: " + day);
        
        String month = s.nextLine();
        System.out.println("Enter the Month: "+ month);
        
        String num = s.nextLine();
        System.out.println("Enter the day of the month: " + num);
        
        String year = s.nextLine();
        System.out.println("Enter the year: " + year);
        
        System.out.println("American Format:" + day +", "+ month + num
        + ", " +year);
        
        System.out.println("European Format:" + day +" "+ num + " "+ month
      + " "  + " " +year);
        
        // String Eday = s.nextLine();
        // System.out.println("Enter the day of the week:" + Eday);
        
        // String Enum = s.nextLine();
        // System.out.println("Enter the day of day of the month:" + Enum);
        
        // String Emonth = s.nextLine();
        // System.out.println("Enter the month:" + Emonth);
        
        // String Eyear = s.nextLine();
        // System.out.println("Enter the year:" + Eyear);
        
        // System.out.print("European Format:"+ Eday+ ", " + Enum + " " + Emonth + ", "  + Eyear); 

    }//end of 
}// closes class
