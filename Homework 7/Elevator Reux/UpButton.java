import java.awt.Component;
import java.awt.event.ActionEvent;

public class UpButton extends EventButton {
    private ElevatorModel model;
    private ElevatorView view;
    public UpButton(int x, int y, int w, int h, ElevatorModel m, ElevatorView v){
        super("Up");
        model=m;
        view=v;
        setBounds(x,y,w,h);
    }    
    public void actionPerformed(ActionEvent e) {
       model.moveUp();
       view.modelHasChanged();
    }
}