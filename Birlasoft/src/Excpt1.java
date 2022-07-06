/*Task - 2 Define a new exception, called ExceptionLineTooLong,
 *  that prints out the error message "The strings is too long".
 *   Write a program that reads string and throws an exception of 
 *   type ExceptionLineTooLong in the case where a string is longer
 *    than 10 characters. Handle also all exceptions that could be thrown by
 *     the program
 */


import java.util.Scanner;
public class Excpt1 {

    public static void main(String[] args) throws StringTooLongException{
        String str1;
        
        final int MAX_STRING_LENGTH = 20;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter strings, enter DONE when finished:\n");
        
        str1 = input.nextLine();
        if(str1.equalsIgnoreCase("done"))
            System.exit(0); //exit on first prompt
        do{
            try
            {
                if(str1.length()>MAX_STRING_LENGTH)
                    throw new StringTooLongException();
               
                System.out.println("\nEnter a string, enter DONE when finished:\n");
                str1 = input.nextLine();            
            }
              
            catch(StringTooLongException e)
            {
                    System.out.println(e.getMessage());
                    str1 = input.nextLine();
            }
        }while(!str1.equalsIgnoreCase("done"));
        input.close();
    }
}













/*
import java.util.Scanner;
public class ReadStrings {

    public static void main(String[] args) throws StringTooLongException{
        String str1;
        final int MAX_STRING_LENGTH = 20;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter strings, enter DONE when finished:\n");
        str1 = input.nextLine();
        if(str1.equalsIgnoreCase("done"))
            System.exit(0); //exit on first prompt
        do{
            try
            {
                if(str1.length()>MAX_STRING_LENGTH)
                    throw new StringTooLongException();
                System.out.println("\nEnter a string, enter DONE when finished:\n");
                str1 = input.nextLine();            
            }
                catch(StringTooLongException e)
            {
                    System.out.println(e.getMessage());
                    str1 = input.nextLine();
            }
        }while(!str1.equalsIgnoreCase("done"));
        input.close();
    }
}
*/