import java.awt.Color;
public class TrafficLightView extends Rectangle{
    private Oval red, green, yellow;
    private TrafficLightModel model;
    public TrafficLightView(int x, int y, int w, int h, TrafficLightModel model){
        super(x,y,w,h);
        this.model=model;
        red=new Oval(0,0,0,0);
        add(red,0);
        green=new Oval(0,0,0,0);
        add(green,0);
        yellow=new Oval(0,0,0,0);
        add(yellow,0);
        setSize(w,h);
        modelChanged();
        
        
    }
    public void setSize(int w, int h){
        super.setSize(w,h);
        red.setBounds(w/4,h/12,w/2,h/6);
        yellow.setBounds(w/4,h/12+h/3,w/2,w/6);
        green.setBounds(w/4,h/12+2*h/3,w/2,w/6);
    }
    public void modelChanged(){
        if(model.isRed()){
            red.setBackground(Color.red);
        }else{
            red.setBackground(Color.black);
        }
        if(model.isGreen()){
            green.setBackground(Color.green);
        }else{
            red.setBackground(Color.black);
        }
        if(model.isYellow()){
            yellow.setBackground(Color.yellow);
        }else{
            red.setBackground(Color.black);
        }
    }
}
        