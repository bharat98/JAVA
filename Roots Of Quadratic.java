/** 	Write a Java program to find the roots of quadratic equation. [eg: ax^2+bx+c, read integer values for a, b, c from user.
      Calculate int d= b^2-4ac. 
      Use type casting for finding the roots.
*/

/**
 *
 * @author Bharat Gurbaxani
 */
 
import static java.lang.Math.sqrt;
import java.util.Scanner;
 
public class root {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER THE VALUES : A B C");
        int a =obj.nextInt();
        int b =obj.nextInt();
        int c =obj.nextInt();
        int d=(b*b)-(4*a*c);
        System.out.println("D IS "+d+" .THEREFORE:");
        int x1=(int) (-b+sqrt(d))/2*a;
        int x2=(int) (-b-sqrt(d))/2*a;

        if(d >0)
        {
                System.out.println("ROOTS ARE REAL AND DISTINCT"+x1  +x2);
        }
        if(d<0)
        { System.out.println("ROOTS ARE UNREAL"+x1  +x2);}
        if(0==d)
        {System.out.println("ROOTS ARE EQUAL"+x1  +x2);}
        
}
}
