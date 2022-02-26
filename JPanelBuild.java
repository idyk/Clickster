package clickster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class JPanelBuild extends JPanel {    

    JButtonBuild jButtonBuild;
    JLabelBuild jLabelBuild;
    
    JPanel clickScreenPanel;
    JPanel pointsPanel;
    JPanel clickMenuPanel;
    
    JPanel shopScreenPanel;
    
    JPanel settingsPanel;
    
    public JPanelBuild() {
        jButtonBuild = new JButtonBuild();
        jLabelBuild = new JLabelBuild();

        //The panel that contains the click contents. 
        clickScreenPanel = new JPanel();
        pointsPanel = new JPanel();
        clickMenuPanel = new JPanel();
        //Layout needs to be worked on. (2/13/22)
        pointsPanel.add(jLabelBuild.getPointsLabel());        
        pointsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pointsPanel.setBackground(Color.WHITE);
        
        clickMenuPanel.add(jButtonBuild.click);
        clickMenuPanel.add(jButtonBuild.save);
        clickMenuPanel.add(jButtonBuild.reset);
        clickMenuPanel.setBackground(Color.white);
        
        clickScreenPanel.setLayout(new BorderLayout());
        clickScreenPanel.add(pointsPanel, BorderLayout.NORTH);
        clickScreenPanel.add(clickMenuPanel, BorderLayout.SOUTH);
        clickScreenPanel.setBackground(Color.WHITE);

        //The panel that contains shop related contents.
        shopScreenPanel = new JPanel();
        shopScreenPanel.add(jLabelBuild.shopTitle);
        shopScreenPanel.add(jButtonBuild.upgrade_one);
        shopScreenPanel.add(jButtonBuild.upgrade_two);
        shopScreenPanel.add(jButtonBuild.upgrade_three);
        shopScreenPanel.add(jButtonBuild.upgrade_four);
        shopScreenPanel.add(jButtonBuild.upgrade_five);
        
        shopScreenPanel.setBackground(Color.YELLOW);

        //The panel that contains Setting-related contents.
        settingsPanel = new JPanel();
        settingsPanel.add(jLabelBuild.settingsTitle);
        settingsPanel.setBackground(Color.PINK);
        
    }

    //Make sure to make a get method for each. This is for the Pane's Tabs.
    public JPanel getClickScreenPanel() {
        return clickScreenPanel;
    }
    
    public JPanel getShopScreenPanel() {
        return shopScreenPanel;
    }
    
    public JPanel getSettingsPanel() {
        return settingsPanel;
    }
    
}
