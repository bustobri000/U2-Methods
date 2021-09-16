import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    public static void main(String[] args) {
        //create and run the program

       double radius = getInput("What is the radius?");
       double area = area(radius);
       double circumference = circumference(radius);
      // JOptionPane.showInputDialog(null, displayResult(area, circumference));
        outputResults(area, circumference);
    }
    public static double getInput(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /*  public  static String displayResult(double area, double circumference){
        DecimalFormat round = new DecimalFormat("#,###.00");
        return "The area is: " + round.format(area) + "\nThe circumference is: " + round.format(circumference);
    }
     */
    public static void outputResults(double area, double circumference){
        DecimalFormat round = new DecimalFormat("#,###.00");
        String message = "The area is: " + round.format(area) + "\nThe circumference is: " + round.format(circumference);
        JOptionPane.showMessageDialog(null, message);
    }
}
