import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {
    JFrame window = new JFrame("NintendoSwitch");
    JPanel panel = new JPanel();
    JButton Red = new JButton("Burn the screen...");
    JButton Blue = new JButton("Freeze Jeremy's hopes and dreams...");
    JButton Green = new JButton("Bore a tree to death..");

    Color IntelliJGray = new Color(43, 43, 43);
    Color offWhite = new Color(248, 248, 228);
    Color Freeze = new Color(120, 160, 240);
    Color Warm1 = new Color(250, 80, 10);
    Color Warm2 = new Color(255, 20, 10);
    Color Warm3 = new Color(200, 200, 0);
    Color Cold1 = new Color(0, 200,200);
    Color Cold2 = new Color(20, 60, 180);
    Color Cold3 = new Color(0, 20,60);
    Color Boring1 = new Color(60, 100, 60);
    Color Boring2 = new Color(100, 100, 100);
    Color Boring3 = new Color(55, 200, 80);

    //Declare your frame, panel and three buttons.
    public ColorSwitchGUI(){
        //create your GUI
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(400, 300);

        Red.setBackground(Warm2);
        Red.setForeground(IntelliJGray);
        Blue.setBackground(Cold1);
        Blue.setForeground(IntelliJGray);
        Green.setBackground(IntelliJGray);
        Green.setBackground(Boring1);
        panel.setBackground(Color.white);

        panel.add(Red);
        Red.addActionListener(new RedActionListenerClass());
        panel.add(Blue);
        Blue.addActionListener(new BlueActionListenerClass());
        panel.add(Green);
        Green.addActionListener(new GreenActionListenerClass());
        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class RedActionListenerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Red.setBackground(Warm2);
            Red.setForeground(IntelliJGray);
            Blue.setBackground(Warm1);
            Blue.setForeground(IntelliJGray);
            Green.setBackground(Warm3);
            Green.setForeground(IntelliJGray);

            panel.setBackground(offWhite);
        }
    }
    private class BlueActionListenerClass implements ActionListener{

       @Override
        public void actionPerformed(ActionEvent actionEvent){
            Red.setBackground(Cold2);
            Red.setForeground(offWhite);
            Blue.setBackground(Cold1);
            Blue.setForeground(offWhite);
            Green.setBackground(Cold3);
            Green.setForeground(Freeze);

            panel.setBackground(Freeze);
        }
    }
    private class GreenActionListenerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Red.setBackground(Boring3);
            Red.setForeground(IntelliJGray);
            Blue.setBackground(Boring2);
            Blue.setForeground(IntelliJGray);
            Green.setForeground(IntelliJGray);
            Green.setBackground(Boring1);

            panel.setBackground(IntelliJGray);
        }
    }
}
