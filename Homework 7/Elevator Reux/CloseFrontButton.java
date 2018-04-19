import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
public class CloseFrontButton extends EventButton {
    private ElevatorModel model;
    private ElevatorView view;
    public CloseFrontButton(int x, int y, int w, int h, ElevatorModel m, ElevatorView v){
        super("Close Front");
        model=m;
        view=v;
        setBounds(x,y,w,h);
    }    
    public void actionPerformed(ActionEvent e) {
       model.closeFront();
       view.modelHasChanged();
    }
}