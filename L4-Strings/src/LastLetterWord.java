import javax.swing.*;
import java.util.Locale;
public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    public static void main(String[] args) {
        //stealing jesus
        //defining jesus 2
        //returning jesus 2

        String part1 = JOptionPane.showInputDialog("Enter word 1: ");
        String part2 = JOptionPane.showInputDialog("Enter word 2: ");
        String part3 = JOptionPane.showInputDialog("Enter word 3: ");

        JOptionPane.showMessageDialog(null, lastThree(part1) + lastThree(part2) + lastThree(part3));
    }

    public static String lastThree(String part) {
        return part.substring(part.length() - 3);
    }
}