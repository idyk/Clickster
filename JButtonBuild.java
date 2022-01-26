
package clickster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class JButtonBuild extends JButton{
    JButton click;
    JButton save;
    JButton load;
    JButton reset;
    ButtonHandler handler;
    Middleware mw = new Middleware();
    
    public JButtonBuild(){
        click = new JButton("Click");    
        save = new JButton("Save");
        load = new JButton("Load");
        reset = new JButton("Reset");
        
        handler = new ButtonHandler();
        
        click.addActionListener(handler);
        save.addActionListener(handler);  
        load.addActionListener(handler);
        reset.addActionListener(handler);
    }

private class ButtonHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println("Action performed");
        mw.actionPerformed(event);
    }
}


public JButton getClick(){
        return click;
    }
    
    

}
