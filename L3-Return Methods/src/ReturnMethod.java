import javax.swing.*;

public class ReturnMethod {

    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width"));
        //one way to use return methods
        double area = area(length, width);
        double perimeter = perimeter(length, width);
        JOptionPane.showMessageDialog(null, "The area is: "+ area + "\nThe perimeter is: " + perimeter);
    }

    public static double area(double length, double width){
        return length * width;
    }

    public static double perimeter(double length, double width){
        return  2 * (length + width);
    }
}
