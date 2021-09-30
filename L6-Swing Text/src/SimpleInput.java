import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static  int clickerCount = 0;
    static JLabel clickerCountLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("ඞ");
        JPanel panel = new JPanel();
        clickerCountLabel = new JLabel("Kill Count: ");
        JButton clicker = new JButton("Click to be sus!");

        window.setSize(250, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(clickerCountLabel);
        panel.add(clicker);
        window.add(panel);


        window.setVisible(true);
    }

    private static class ClickerListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            clickerCount++;

            clickerCountLabel.setText("Kill Count: " + clickerCount);
        }
    }
}
