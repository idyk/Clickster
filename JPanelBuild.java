
package clickster;
import javax.swing.JPanel;

public class JPanelBuild extends JPanel{ 
    JPanel pointsPanel;
    JPanel saveFunctionsPanel;
    JButtonBuild jButtonBuild;
    JLabelBuild jLabelBuild;

    
    public JPanelBuild(){
        jButtonBuild = new JButtonBuild();
        jLabelBuild = new JLabelBuild();
        pointsPanel = new JPanel();
        saveFunctionsPanel = new JPanel();
        
        pointsPanel.add(jLabelBuild.getPointsLabel()); 
        saveFunctionsPanel.add(jButtonBuild.click);
        saveFunctionsPanel.add(jButtonBuild.save);
      //  saveFunctionsPanel.add(jButtonBuild.load);
        saveFunctionsPanel.add(jButtonBuild.reset);
    }
    
    public JPanel getPointsPanel() {
        return pointsPanel;
    }
    
    public JPanel getSavePanel(){
        return saveFunctionsPanel;
    }
    
    
}
