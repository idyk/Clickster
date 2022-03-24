package clickster;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Pane extends JFrame {

    Container pane;
    JPanelBuild jPanel;
    JPanel topPanel;
    Pane guiRef;

    public Pane() {
        initGUI();
    }

    public void storeRef(Pane gui) {
        this.guiRef = gui;
    }

    private void initGUI() {
        Middleware mw = new Middleware();
        JTabbedPane tabbedPane = new JTabbedPane();
        pane = getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));

        jPanel = new JPanelBuild();

        //Create the tabs here! Make sure that the corresponding panel has everything in it.
        tabbedPane.addTab("Click", jPanel.getClickScreenPanel());
        tabbedPane.addTab("Shop", jPanel.getShopScreenPanel());
        tabbedPane.addTab("Settings", jPanel.getSettingsPanel());
        tabbedPane.addTab("Milestones", jPanel.getMilestonesPanel());
        tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
        tabbedPane.setOpaque(true);
        tabbedPane.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        tabbedPane.setBackgroundAt(0, Color.WHITE);
        tabbedPane.setBackgroundAt(1, Color.YELLOW);
        tabbedPane.setBackgroundAt(2, Color.PINK);
        tabbedPane.setBackgroundAt(3, Color.CYAN);
        add(tabbedPane);
        
        System.out.println("pane");
    }

}
