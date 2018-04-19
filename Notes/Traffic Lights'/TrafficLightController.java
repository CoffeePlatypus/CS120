import javax.swing.JFrame;

public class TrafficLightController{
    TrafficLightModel light;
    TrafficLightView view;
    public TrafficLightController(){
        light=new TrafficLightModel();
        view= new TrafficLightView(10,10,100,300,light);
        
        JFrame win=new JFrame("lights");
        win.setLayout(null);
        win.setBounds(20,20,500,500);
        win.add(view);
        
    }
}
        