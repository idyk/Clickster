
package clickster;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
        pane = getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
        jPanel = new JPanelBuild();

        
        pane.add(jPanel.getPointsPanel());
        pane.add(jPanel.getSavePanel());
    }
    
    
}
