/**
    Program 4: Apply an Object oriented paradigm using java to develop a stand alone 
    application for Number conversion in java. 
    (may be for this we would introduce the basic data types) 
    Level: Intermediate
*/

/**
*
* @author Bharat Gurbaxani
*/
 
import java.util.Scanner;

public class binary {
    public static void main(String args[])
    {    
        System.out.println("ENTER THE NUMBER IN DECIMAL:");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String Binary = Integer.toBinaryString(a);
        System.out.println(Binary);
        String oct= Integer.toOctalString(a);
        System.out.println(oct);

    
    
    }
}
