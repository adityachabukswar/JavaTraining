/* Throw an ArithmeticException if any argument of an method = 0.
 *  Otherwise return Multiplication of both number.
*/

import java.io.*;

class Excp {
    public static void main(String[] args)
    {
        try {
            int number[] = new int[10];
            number[10] = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Zero cannot divide any number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Index out of size of the array");
        }
    }
}




/*
#time for calculating 1-100
a=now()
{
   logic for sum
}

b= now()

difference = b-a 
print(time to sum 1-100 = difference in miliseconds )

#time for calculating 1-1000
{

}
print(time to sum 1-1000 = "")
#time for calculating 1-10000
{

}
print(time to sum 1-10000 = "")
*/
/*find the sum of 1 to 100 numbers
(1+2+4+5+6+7....)

#time for calculating 1-100
{
   logic for sum
}
print(time to sum 1-100 = "")

#time for calculating 1-1000
{

}
print(time to sum 1-1000 = "")
#time for calculating 1-10000
{

}
print(time to sum 1-10000 = "")
series_sum()
*/