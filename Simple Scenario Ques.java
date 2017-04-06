/**
    Program 5: Write a Program in C, C++ and Java for the given scenario.
    Write a program to calculate the total and average of marks in 2 subjects.
    Repeat the program for 2 students. Validate the mark is never less than 0 
    or greater than 100 before assigning to the respective variables. 
    Your Program should also be capable of identifying the student with the best score and display the same. 
    
    Note: Weightage will be given to appropriate methods and variable names, proper code logic and apt comments)
*/


/**
 *
 * @author Bharat Gurbaxani
 */


import java.util.Scanner;

public class Students{
public static void main(String args[])
    {
        String name1=" ",name2=" ";
        int m1,m2,m3,m4,t1,t2,a1,a2;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 2 names of the students");
        name1=obj.next();
        name2=obj.next();
        System.out.println("enter marks of english and maths for "+ name1);
        m1=obj.nextInt();
        m2=obj.nextInt();
        if(m1<0||m1>100)
        {
            System.out.println("wrong entry");
        }
        if(m2<0||m2>100)
        {
            System.out.println("wrong entry");
        }
        System.out.println("enter marks of english and maths for "+ name2);
        m3=obj.nextInt();
        m4=obj.nextInt();
        if(m3<0||m3>100)
        {
            System.out.println("wrong entry");
        }
        if(m1<0||m1>100)
        {
            System.out.println("wrong entry");
        }
        System.out.println("the total and average marks of " +name1 );
        t1=m1+m2;
        a1=t1/2;
        System.out.println(t1);
        System.out.println(a1);
        System.out.println("the total and average marks of " +name2);
        t2=m3+m4;
        a2=t2/2;
        System.out.println(t2);
        System.out.println(a2);
        if(m1>m3)
        {
            System.out.println("the best score in english is of  "+name1);
        }
else
        {
            System.out.println("the best score in english is of   "+name2);
        }
        if(m2>m4)
        {
            System.out.println("the best score in maths is of  "+name1);
        }
else
        {
            System.out.println("the best score in maths is of  "+name2);
        }
    }
}
