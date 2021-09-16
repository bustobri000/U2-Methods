import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {

    /*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.

    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     */

    public static void main(String[] args) {
        //get inputs
        int x1 = getInputs("Point 1, x: ");
        int y1 = getInputs("Point 1, y: ");
        int x2 = getInputs("Point 2, x: ");
        int y2 = getInputs("Point 2, y: ");
        int x3 = getInputs("Point 3, x: ");
        int y3 = getInputs("Point 3, y: ");
        //do math
        double distance1 = distance(x1, y1, x2, y2);
        double distance2 = distance(x2, y2, x3, y3);
        double distance3 = distance(x1, y1, x3, y3);

        double perimeter = perimeter(distance1, distance2, distance3);
        //send outputs
        sendOutput(perimeter);
    }
    public static int getInputs(String prompt){
        return Integer.parseInt(JOptionPane.showInputDialog((prompt)));
    }

    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
    }

    public static double perimeter(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }

    public static void sendOutput(double perimeter){
        DecimalFormat round = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null, "The perimeter is: " + round.format(perimeter));
    }
}
