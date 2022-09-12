import java.io.*;
import java.util.Scanner;

public class four {
    public static void main(String[] args) throws IOException {

        // File file = new File("Alphabets.txt");
        // FileInputStream fin = new FileInputStream("Alphabets.txt");
        FileReader fin = new FileReader("Alphabets.txt");
        // FileOutputStream fout = new FileOutputStream("Alphabets.txt");

        // File file2 = new File("consonants.txt");
        // FileInputStream fin2 = new FileInputStream("Consonants.txt");
        FileOutputStream fout = new FileOutputStream("Consonants.txt");

        int c;
        do{
            c =  fin.read();
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                try{
                    throw new VowelNotAllowedException();
                }catch(VowelNotAllowedException e3){
                    System.out.println(e3.toString());
                }
            }
            else{
                fout.write(c);
                
            }
        }while(c!=-1);
    }
}

class VowelNotAllowedException extends Exception{
    public String toString(){
        return "Vowels is  not allowed .. ";
    }
}