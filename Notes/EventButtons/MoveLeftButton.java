import java.awt.ActionEvent;
public class MoveRightButton  extends EventButton {
    private OvalColtroller controller;
    public MoveLeftButton(int x, int y, int w, int h, OvalController C){
        super("Move Right");
        setBounds(x,y,w,h);
        controller=c;
    }    
    public void actionPreforme(ActionEvent e) {
        //oval.setBounds(oval.getX()+5, oval.getY(), oval.getWidth(), oval.getHeight());
        //oval.setLocation(oval.getX()+5, oval.getY());
        //oval.repaint();
        controller.moveLeftClicked();
    }
}