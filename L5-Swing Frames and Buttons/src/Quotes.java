import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Quotes are bad for your health");
        JPanel panel = new JPanel();
        JButton internet = new JButton("On the internet");
        JButton genocide = new JButton("Genocide route");
        JButton button3 = new JButton("Nuclear Gandhi");
        window.setSize(500, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        internet.addActionListener(new InternetListener());
        genocide.addActionListener(new GenocideListener());
        button3.addActionListener(new Button3Listener());

        panel.add(internet);
        panel.add(genocide);
        panel.add(button3);

        window.add(panel);
        window.setVisible(true);
    }

    private static class GenocideListener implements ActionListener {

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "But nobody came...");
        }
    }
    private static class InternetListener implements ActionListener {

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Never believe everything you read on the internet. - Abe Lincoln");
        }
    }
    private static class Button3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "The world is the problem, and the nuke is the solution. - Gandhi");
        }
    }
}
