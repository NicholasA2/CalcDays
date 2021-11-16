/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class CalcDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Get user input
        Scanner getInputMonth = new Scanner(System.in);
        System.out.print("Please enter a month number: ");
        String monthString = getInputMonth.nextLine();
        Scanner getInputYear = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        String yearString = getInputYear.nextLine();
        
        //Convert string to int
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);
        
        //Print based on result
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        {System.out.println("There are 31 days in the month");  }
        else if (month==4 || month==6 || month==9 || month==11)
        {System.out.println("There are 30 days in the month");}
        else if (month==2)
        { if (year%4==0) {System.out.println("There are 29 days in the month");}
        else System.out.println("There are 28 days in the month"); }
        
        //Recreate with switch case
        switch (month) {
            case 1: System.out.println("There are 31 days in the month");
            break;
            case 2: if (year%4==0) {System.out.println("There are 29 days in the month");}
        else System.out.println("There are 28 days in the month"); 
            break;
            case 3: System.out.println("There are 31 days in the month");
            break;
            case 4: System.out.println("There are 30 days in the month");
            break;
            case 5: System.out.println("There are 31 days in the month");
            break;
            case 6: System.out.println("There are 30 days in the month");
            break;
            case 7: System.out.println("There are 31 days in the month");
            break;
            case 8: System.out.println("There are 31 days in the month");
            break;
            case 9: System.out.println("There are 30 days in the month");
            break;
            case 10: System.out.println("There are 31 days in the month");
            break;
            case 11: System.out.println("There are 30 days in the month");
            break;
            case 12: System.out.println("There are 31 days in the month");
            break;
        }
        
        
        
        
    }
    
}
