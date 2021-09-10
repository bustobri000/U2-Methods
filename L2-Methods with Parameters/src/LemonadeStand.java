import javax.swing.*;
import java.text.DecimalFormat;
public class LemonadeStand {

    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {
        int cupsSixteen = Integer.parseInt(JOptionPane.showInputDialog("What is the amount of 16 oz cups sold?"));
        int cupsTwenty = Integer.parseInt(JOptionPane.showInputDialog("What is the amount of 20 oz cups? sold"));
        sales(cupsSixteen, cupsTwenty);
    }

    public static void sales(int cupsSixteen, int cupsTwenty) {
        DecimalFormat round = new DecimalFormat("#,###.00");
        double sixteenSales = cupsSixteen * 0.5;
        double twentySales = cupsTwenty * 0.99;
        double tax = 7.5;
        double total = (sixteenSales + twentySales) * (1 + tax/100.0);

        String message = "Your Order is:";
        message += "\nNumber of 16oz cups sold: " + cupsSixteen;
        message += "\nNumber of 20oz cups sold: " + cupsTwenty;
        message += "\nThe total sales is: $" + round.format(total);

        JOptionPane.showMessageDialog(null, message);
    }
}
