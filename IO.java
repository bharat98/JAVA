package lab.pkg1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Bharat Gurbaxani
 */
public class IO {
    public static void main(String args[]) throws IOException{
Scanner scan = new Scanner(System.in);    
System.out.println("simple message");  
System.err.println("error message");  

// This "System.in.read()" does the same work as that of Scanner class
int i = System.in.read();//returns ASCII code of 1st character 
int j = scan.nextInt();

//"System.out.println()" is for the output.
System.out.println((char)i);//will print the character  

}
}
