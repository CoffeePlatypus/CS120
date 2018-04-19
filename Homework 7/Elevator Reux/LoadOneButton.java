import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
public class LoadOneButton extends EventButton {
    private ElevatorModel model;
    private ElevatorView view;
    public LoadOneButton(int x, int y, int w, int h, ElevatorModel m, ElevatorView v){
        super("Load 1");
        model=m;
        view=v;
        setBounds(x,y,w,h);
    }    
    public void actionPerformed(ActionEvent e) {
       model.loadPeople(1);
       view.modelHasChanged();
    }
}