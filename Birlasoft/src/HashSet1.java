

import java.util.*;

class HashSet1{
	
 public static void main(String args[]){  
  //Creating HashSet and adding elements
	 
    HashSet<String> set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");
           
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
} 

/*Consider a scenario where you are suppose to write data
 *  on data.txt file from one class by user input. read that
 *   data from another class and store the data in Likedlist,
 *    also traverse through every element using iterator as well
 *     as foreach loop.
 */

