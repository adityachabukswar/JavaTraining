// task3. make all the odd number of characters in a sentence capital
import java.util.Scanner;

import java.util.*;

public class Alternate { 
	  public static void main(String[] args) { 
		System.out.println("Enter the Name");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		traverseString(str);
	  }
	  static void traverseString(String str)
	  {
		  for(int i=0;i < str.length();i++)
		  {
			  if(str.charAt(i).equals(' ');
			  {
				  
			  }
			  else {
				  
			  }
		  }
	  }
	  }

































/*
public class Alternate { 
	  public static void main(String[] args) { 
		  Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the String");
	   
		  // initialize string 
	    String sample = "aditya vsant chabukswar"; 
	    
	    // initialize string buffer to hold updated string 
	    StringBuffer updatedString = new StringBuffer(); 
	    
	    // get array of characters in string 
	    char[] characters = sample.toCharArray(); 
	    
	    // iterate over characters 
	    for (int index = 0; index < characters.length; index++) { 
	    
	    	// get current character 
	      char c = characters[index]; 
	      
	      // check if position of this character is odd 
	      if (index % 2 != 0) { 
	      
	    	  // convert it to upper case 
	        c = Character.toUpperCase(c); 
	      } 
	      // append character to string buffer 
	      updatedString.append(c); 
	    } 
	    System.out.println("Modified string is: " + updatedString.toString()); 
	  } 
	}


public class Alternate { 
	  public static void main(String[] args) { 
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter the string");
		  String str = scan.nextLine();
		  traverseString(str);
	  }
	  static void traverseString(String str)
	  {
		  for(int i=0;i<str.length();i++) {
			  if(i%2 == 0)
			  {
				  char ch = Character.toUpperCase(str.charAt(i));
			  }
			  else
			  {
				  System.out.print(str.charAt(i)+ " ");
			  }
		  }
	  }
	  }

*/
