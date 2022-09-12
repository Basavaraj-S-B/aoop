//scp

import java.util.*;

class ArithmeticException extends Exception {
      
}


class ArrayIndexOutOfBoundsException extends Exception {

}

class NegativeArraySizeException extends Exception {

}



public class one {

 public static void main(String args[]) {
 
        Scanner in = new Scanner(System.in);
		
            
			
			  
			 System.out.println("Enter the number to be read");
		       int number1=in.nextInt();
               int number2=in.nextInt();
			   int result;
			try {
	           result=number1/number2; 	
			   System.out.println("Result= " + result);
			 
			 
            }
			catch(ArithmeticException e) {
                  System.out.println(" It is not possible\n");
            }

 }
}














			
		
		
		
		
 
  
