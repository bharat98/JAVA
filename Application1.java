/* 
Simple GUI application with simple implementation of frame and label. 
*/


package lab.pkg1;
import javax.swing.*;
/**
 *
 * @author Bharat Gurbaxani
 */

/* key points for defining frame in GUI application
    1. define object of JFrame(association)
    2. set its visibility (obj.setVisible(true);)
    3. set its size(obj.setSize(int,int);)
    4. set its closing (obj.setDefaultCloseOperation(obj.EXIT_ON_CLOSE);)
*/
public class Application1 {
    void makeapp(){
        JFrame frame1 = new JFrame("Application1");
        frame1.setSize(275,100);
        JFrame frame2 = new JFrame("Application2");
        frame2.setVisible(true);
        frame1.setVisible(true);
        JLabel obj1 = new JLabel("Application1");
        frame1.add(obj1);
    }
public static void main(String args[]){
    Application1 obj = new Application1();
    obj.makeapp();
}
}
