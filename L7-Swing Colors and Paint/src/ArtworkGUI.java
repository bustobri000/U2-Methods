import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES

    JFrame frame;
    Color AmogusRed = new Color(197, 17, 17);
    Color AmogusRed2 = new Color(122, 8, 56);
    Color Visor = new Color(148, 201, 219);
    Color Visor2 = new Color(74, 100, 109);
    public ArtworkGUI()
    {
        //CREATE THE GUI
        frame = new JFrame("When the Artwork is sus!! ඞ");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new ArtworkGUI.MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.BLACK);
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){

            super.paintComponent(g);
            //ඞ

            //skin
            g.setColor(AmogusRed);
            g.fillRect(20, 20, 140, 190);
            g.setColor(AmogusRed2);
            g.fillRect(20, 210, 60, 210);
            g.fillRect(100, 210, 60, 210);
            //outline
            g.setColor(Color.WHITE);
            g.drawLine(20, 20, 20, 420);
            g.drawLine(20, 420, 80, 420);
            g.drawLine(80, 420, 80, 210);
            g.drawLine(80, 210, 100, 210);
            g.drawLine(100, 210, 100, 420);
            g.drawLine(100, 420, 160, 420);
            g.drawLine(160, 420, 160, 20);
            g.drawLine(160, 20, 20,20);
            //helmet? visor?
            g.setColor(Visor2);
            g.fillRect(45, 45, 90, 90);
            g.setColor(Visor);
            g.fillRect(45, 45, 75, 80);
            g.setColor(Color.WHITE);
            g.drawRect(45, 45, 90, 90);
            g.fillRect(50, 50, 60, 20);

            //sus
            g.drawLine(200, 400, 250, 400);
            g.drawLine(250, 400, 250, 350);
            g.drawLine(250, 350, 200, 350);
            g.drawLine(200, 350, 200, 300);
            g.drawLine(200, 300, 250, 300);

            g.drawLine(275, 300, 275, 400);
            g.drawLine(275, 400, 325, 400);
            g.drawLine(325, 400, 325, 300);

            g.drawLine(350, 400, 400, 400);
            g.drawLine(400, 400, 400, 350);
            g.drawLine(400, 350, 350, 350);
            g.drawLine(350, 350, 350, 300);
            g.drawLine(350, 300, 400, 300);

            //backpackorsomethingidunnowhattheyhaveonthierbackIthinkitsaoxygenthingihavenoidea

            g.setColor(AmogusRed2);
            g.fillRect(160, 80, 75, 150);
            g.setColor(AmogusRed);
            g.fillRect(160, 80, 75, 25);
            g.setColor(Color.white);
            g.drawRect(160, 80, 75, 150);

            //slightlyoffcentermoonorsomethingidon'tplayamongusalsothiswouldbeannoyingtoreadbecauseididnotputanyspacesorcapitallettersalsothisgoespastmostscreenresolutionsandcannotbeseenalsoididntfinishthissentenceandmispeltwordswhyareyoureadingthisjerma985iscurrentlystealingmycheesehelptheaudienceistakingeverything
            g.setColor(Color.YELLOW);
            g.fillOval(350, 50, 69, 69);
            g.setColor(Color.BLACK);
            g.fillOval(365, 55, 69, 60);

            //astronimcallyincorrectstarsorsomethingbutalsolayedoutinagridbecauseimlazy

            g.setColor(Color.white);
            g.drawLine(390, 70, 390, 70);
            g.drawLine(395, 75, 395, 75);
            g.drawLine(395, 70, 395, 70);
            g.drawLine(390, 75, 390, 75);
            g.drawLine(380, 70, 380, 70);
            g.drawLine(385, 70, 385, 70);
            g.drawLine(390, 80, 390, 80);
            g.drawLine(390, 85, 390, 85);
            g.drawLine(395, 80, 395, 80);
            //im too lazy to finish the "stars"
        }
    }
}
