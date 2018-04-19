import javax.swing.JFrame;
public class OvalController{
    private Oval oval;
    public OvalController(){
        JFrame win= new JFrame("Mae");
        
        Oval oval=new Oval(50,50,50,50);
        win.add(oval,0);
        EventButton b1= new MoveRight(5,5,100,20,oval);
        EventButton b2= new MoveLeft(5,5,100,20,this);
        win.add(b1,0);
        win.add(b2,0);
    }
    public void moveLeftClicked(){
        oval.setLocation(oval.getX()-5, oval.getY());
        oval.repaint();
    }
    public void moveRightClicked(){
        oval.setLocation(oval.getX()+5, oval.getY());
        oval.repaint();
    }
}