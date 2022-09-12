//scp
import java.util.*; //importing the required components only

class SubstringNotFoundException extends Exception{
String str;
    SubstringNotFoundException(String str){
        this.str = str;
    }
    public String toString() {
        return this.str;
    }

}

//main class
public class three {

  public static void main(String[] args)throws SubstringNotFoundException {
   
    Scanner in= new Scanner(System.in);
    System.out.print("Enter the input String =");
    String pattern = in.nextLine();
    pattern =  pattern.toUpperCase();
    String subString="SDMCET";
    
    int i=0,j=0;
    while(i<pattern.length()){
        if(pattern.charAt(i)==subString.charAt(j) && j<subString.length()-1){
            i++; //i incrementation
            j++; //j incrementation
        }else{
            i++; //i incrementation
        }


    }  //end of while
    
    if(j == subString.length()-1){ //if it satisfise this case then the sub string is found
        System.out.println("Substring is successfully found");
    }
	else{
        throw new SubstringNotFoundException("Substring is not present in the given input");
    }


   }
    
}

