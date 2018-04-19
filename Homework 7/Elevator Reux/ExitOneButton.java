import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
public class ExitOneButton extends EventButton {
    private ElevatorModel model;
    private ElevatorView view;
    public ExitOneButton(int x, int y, int w, int h, ElevatorModel m, ElevatorView v){
        super("Exit 1");
        model=m;
        view=v;
        setBounds(x,y,w,h);
    }    
    public void actionPerformed(ActionEvent e) {
       model.exitPeople(1);
       view.modelHasChanged();
    }
}