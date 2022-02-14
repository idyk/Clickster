
package clickster;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Pane extends JFrame{
    Container pane;
    JPanelBuild jPanel;
    JPanel topPanel;
    Pane guiRef;
    
    public Pane(){
        initGUI();
    }
    
    public void storeRef(Pane gui){
        this.guiRef = gui;
    }
    
    private void initGUI(){
        Middleware mw = new Middleware();
        JTabbedPane tabbedPane = new JTabbedPane();
        pane = getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
        jPanel = new JPanelBuild();
        
        
        
        //Create the tabs here! Make sure that the corresponding panel has everything in it.
        tabbedPane.addTab("Click", jPanel.getClickScreenPanel());
        tabbedPane.addTab("Shop", jPanel.getShopScreenPanel());
        tabbedPane.addTab("Settings", jPanel.getSettingsPanel());
        
        add(tabbedPane);
     
    }
    
    
}
