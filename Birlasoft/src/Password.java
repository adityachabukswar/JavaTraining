import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String strOne, strTwo;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Password: ");
	      strOne = scan.nextLine();
	      System.out.print("Renter the Password: ");
	      strTwo = scan.nextLine();
	      
	      if(strOne.equals(strTwo))
	         System.out.println("\n The password you entered is Right.");
	      else
	         System.out.println("\n THe Password you entered is not Equal.");
		
		
	}

}

/*You have 2 thread classes and in both threads you have
 *  2 statements in both class you have to put thread sleep
 *   after first statement in thread;
From iQB to Everyone 10:52 AM
Consider a banking application where user can widhraw money,
 Check the condition that ammount is availble in account if not
  then i have to deposit money and then again try to widhraw
*/


/*
//In Banking transaction system

//Class  1
//Bank class
//Defining the banking transaction
class Bank {

 // Initial balance $100
 int total = 100;

 // Money withdrawal method. Withdraw only if
 // total money greater than or equal to the money
 // requested for withdrawal

 // Method
 // To withdraw money
 void withdrawn(String name, int withdrawal)
 {
     if (total >= withdrawal) {
         System.out.println(name + " withdrawn "
                            + withdrawal);

         total = total - withdrawal;
         System.out.println("Balance after withdrawal: "
                            + total);
         // Making the thread sleep for 1 second after
         // each withdrawal

         // Try block to check for exceptions
         try {

             // Making thread t osleep for 1 second
             Thread.sleep(1000);
         }

         // Catch block to handle the exceptions
         catch (InterruptedException e) {

             // Display the exception along with line
             // number
             // using printStacktrace() method
             e.printStackTrace();
         }
     }

     // If the money requested for withdrawal is greater
     // than the balance then deny transaction*/
     else {

         // Print statements
         System.out.println(name
                            + " you can not withdraw "
                            + withdrawal);

         System.out.println("your balance is: " + total);

         // Making the thread sleep for 1 second after
         // each transaction failure

         // Try block to check for exceptions
         try {
             Thread.sleep(1000);
         }

         catch (InterruptedException e) {

             e.printStackTrace();
         }
     }
 }

 // Method - to deposit money
 // Accept money whenever deposited
 void deposit(String name, int deposit)
 {
     System.out.println(name + " deposited " + deposit);
     total = total + deposit;
     System.out.println("Balance after deposit: "
                        + total);
     // Making the thread sleep for 1 second after
     // each deposit
     try {
         Thread.sleep(1000);
     }
     catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}
//Class 2
//main class
class GFG {

 // Main driver method
 public static void main(String[] args)
 {
     // Declaring an object of Bank class and calling the
     // withdarwn and deposit methods with suitable
     // parameters

     // Creating object of class 1 inside main()
     Bank obj = new Bank();

     // Custom input - Transactions
     obj.withdrawn("Arnab", 20);
     obj.withdrawn("Monodwip", 40);
     obj.deposit("Mukta", 35);
     obj.withdrawn("Rinkel", 80);
     obj.withdrawn("Shubham", 40);
 }
}
*/