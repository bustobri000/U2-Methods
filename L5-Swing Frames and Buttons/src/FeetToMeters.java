import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.text.DecimalFormat;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Convert-o-matic");
        JPanel panel = new JPanel();

        JButton F2M = new JButton("Convert Feet to Meters");
        JButton M2F= new JButton("Convert Meters to Feet");
        
        window.setSize(420, 120);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        F2M.addActionListener(new F2MListener());
        M2F.addActionListener(new M2FListener());

        panel.add(F2M);
        panel.add(M2F);

        window.add(panel);
        window.setVisible(true);
    }

    private static class F2MListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //DecimalFormat round = new DecimalFormat("#,##0.00");
            double feet = Double.parseDouble(JOptionPane.showInputDialog(("What is distance in feet you wish to convert?")));
            double meters = feet * 0.3048;
            JOptionPane.showMessageDialog(null, feet + " feet in meters is: "+ meters);
        }
    }

    private static class M2FListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //DecimalFormat round = new DecimalFormat("#,##0.00");
            double meters = Double.parseDouble(JOptionPane.showInputDialog(("What is distance in meters you wish to convert?")));
            double feet = meters / 0.3048;
            JOptionPane.showMessageDialog(null, meters + " meters in feet is: " + feet);
        }
    }
}
