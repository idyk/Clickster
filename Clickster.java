package clickster;

import javax.swing.JFrame;

public class Clickster{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaveSystem SaveSystem = new SaveSystem();
        JLabelBuild jLabelBuild = new JLabelBuild();

        //Loads save upon start up.
        SaveSystem.loadGame();
        jLabelBuild.revalidate();
                
        Pane gui = new Pane();
        gui.storeRef(gui);
        gui.setTitle("Clickster 9000");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setResizable(false);
        gui.setSize(700,550);
        gui.revalidate();
        gui.repaint();
        gui.setVisible(true);
    }
    
}
