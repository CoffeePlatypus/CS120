import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
public class DownButton extends EventButton {
    private ElevatorModel model;
    private ElevatorView view;
    public DownButton(int x, int y, int w, int h, ElevatorModel m, ElevatorView v){
        super("Down");
        model=m;
        view=v;
        setBounds(x,y,w,h);
    }    
    public void actionPerformed(ActionEvent e) {
       model.moveDown();
       view.modelHasChanged();
       repaint();
    }
}