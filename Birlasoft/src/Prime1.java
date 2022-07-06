

//Find all the prime numbers form 1 to 100000 with the help of10 threads



 import java.util.ArrayList;
    import java.util.Scanner;

    public class Prime1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

        System.out.println("How Many threads? ");
        int nThreads = scan.nextInt();  // Create variable 'n'  to handle whatever integer the user specifies.  nextInt() is used for the scanner to expect and Int.

        final Prime[] pThreads = new Prime[nThreads];

        long startTime = System.currentTimeMillis();
        for(int i = 0; i<nThreads; i++){
            pThreads[i] = new Prime();
            pThreads[i].start();

        }
        try {
            for (int i = 0; i < nThreads; i++)
                pThreads[i].join();
        } catch (InterruptedException e) {
            }
            long stopTime = System.currentTimeMillis();

            long elapsedTime = stopTime - startTime;
            System.out.println("Execution time = : "+  elapsedTime);

            System.out.println("----------------------------------------------------");

            int cores = Runtime.getRuntime().availableProcessors();
            System.out.println("How many Cores this Java Program used: " + cores);



          for (int i = 0; i < nThreads; i++)
              System.out.println("Thread " + i + "  Prime count: " + pThreads[i].count); // Display Thread count
         System.out.println("Total prime count: " + ((Object) Prime.primeList).size()); // Output total amount of primes from the Array List
         for (int i = 0; i < 100; i++) // Display first 100 primes.
            System.out.println(Prime.primeList);

         }

    }
    
   /*
    Sir code
    class ThreadDemo implements Runnable {
    Thread t;
    int start = 0;
    int end = 0;
    ThreadDemo(int s,int e) {
       t = new Thread(this, "Thread");
       this.start = s;
       this.end = e;
       System.out.println("thread started: " + t);
       t.start();
    }
    public void run() {
        for (int i = start; i <= end; i++) {  
            if (isPrime(i)) {  
                System.out.println(i);  
            }  
        }  
    }
    
    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }
 }



 class Main {  
    public static void main(String[] args) {  
     int n = 100000;
     int tno = 1000;
     int tasks = n/tno;
     start = 
     for(int i=0;i<tno;i++){
         new ThreadDemo((i*tasks)+1,(i*tasks)+tasks);
     }
     end = 
        
   }
 }

*/