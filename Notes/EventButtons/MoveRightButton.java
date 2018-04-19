import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
public class MoveRightButton  extends EventButton {
    private Oval oval;
    public MoveRightButton(int x, int y, int w, int h, Oval dot){
        super("Move Right");
        oval=dot;
        setBounds(x,y,w,h);
    }    
    public void actionPreforme(ActionEvent e) {
        //oval.setBounds(oval.getX()+5, oval.getY(), oval.getWidth(), oval.getHeight());
        oval.setLocation(oval.getX()+5, oval.getY());
        oval.repaint();
    }
}