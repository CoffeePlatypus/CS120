import java.awt.Color;
import javax.swing.JFrame;
public class Target extends Oval{
    private Oval middle,inner;

    public Target(int x, int y,int d){
        super(x,y,d,d);
        setBackground(Color.white);
        middle=new Oval(d/6,d/6,2*d/3,2*d/3);
        middle.setBackground(Color.red);
        add(middle, 0);
        inner=new Oval(d/5,d/5,d/3,d/3);
        inner.setBackground(Color.white);
        middle.add(inner,0);
    }
    public void setSize(int w, int h){
        setBounds(getX(),getY(),w,h);
        middle.setBounds(w/6,h/6,2*w/3,2*h/3);
        inner.setBounds(w/6,h/6,2*w/3,2*h/3);
    }
    public static void main(String[] args){
        JFrame win=new JFrame("Target");
        Target t=new Target(10,10,500);
        t.setSize(250,250);
        
        win.setLayout(null);
        win.setBounds(0,0,600,600);
        win.add(t);
        win.setVisible(true);
    }
}
