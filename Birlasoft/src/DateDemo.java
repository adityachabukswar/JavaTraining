

import java.util.*;
import java.text.*;

public class DateDemo {

   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
























/*Consider a scenario where you have to take student marks in array for 3 
 * subjects and you have to get average of that. When exception occours manage 
 * exception in sprecific Catch block and also have one catch block for all other exceptions
*/

/* Throw an ArithmeticException if any argument of an method = 0.
 *  Otherwise return Multiplication of both number.
*/