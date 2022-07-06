//Find all the prime numbers form 1 to 100000 with the help of10 threads


public class Prime {

	public static Object primeList;
	public static String count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void join() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}



class Prime extends Thread {
	 
	 public void run() {
	  
	  for(int i=1; i<=10; i++) {
	   if(i==2 || i==3 || i==5 || i==7)
	    System.out.println("Prime no. : " + i);
	  }
	 }
	}

	class NonPrime extends Thread {
	 
	 public void run() {
	  
	  for(int i=1; i<=10; i++) {
	   if(i==4 || i==6 || i==8 || i==9 || i==10)
	    System.out.println("Non-Prime no. : " + i);
	  }
	 }
	}

	public class PrimeNotPrimeThread {

	 public static void main(String[] args) {
	  
	  new Prime().start();
	  new NonPrime().start();
	 }
	}