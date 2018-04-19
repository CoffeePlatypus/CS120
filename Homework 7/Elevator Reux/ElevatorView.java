//Julia Froegel
//Supplier class that draws a picture of an elevator
import java.awt.Color;
import java.awt.Container;
public class ElevatorView {
    private ElevatorModel model;
    private Rectangle elevatorShaft, elevator, fDoor, bDoor;
    private Oval p1,p2,p3,p4,p5,p6;
    private int xx,yy,ww,hh;
    public ElevatorView(int x, int y, int w, int h, ElevatorModel m) {
        elevatorShaft=new Rectangle(x,y,w,h);
        elevator=new Rectangle(0,0,0,0);
        elevator.setBackground(Color.white);
        elevatorShaft.add(elevator,0);
        fDoor=new Rectangle(0,0,w/10,h/4);
        fDoor.setBackground(Color.blue);
        bDoor=new Rectangle(w-w/10,0,w/10,h/4);
        bDoor.setBackground(Color.blue);
        p1=new Oval(-50,-50,10,10);
        p2=new Oval(-50,-50,10,10);
        p3=new Oval(-50,-50,10,10);
        p4=new Oval(-50,-50,10,10);
        p5=new Oval(-50,-50,10,10);
        p6=new Oval(-50,-50,10,10);
        xx=x;
        yy=y;
        ww=w;
        hh=h;
        elevator.add(fDoor,0);
        elevator.add(bDoor,0);
        elevator.add(p1,0);
        elevator.add(p2,0);
        elevator.add(p3,0);
        elevator.add(p4,0);
        elevator.add(p5,0);
        elevator.add(p6,0);
        model=m;
        setSize(w,h);
        modelHasChanged();
        
    }
    public Container getContainer(){
        return elevatorShaft;
    }
    public void setSize(int w, int h) {
        elevatorShaft.setSize(w,h);
        elevator.setBounds(0,3*yy/4,w,h/4);
        fDoor.setBounds(0,0,w/10,h/4);
        bDoor.setBounds(w-w/10,0,w/10,h/4);
        
        
    }
    public void modelHasChanged() {
        setFloor();
        setFDoor();
        setBDoor();
        setPeople();
        elevatorShaft.repaint();
    }
    public void setFloor() {
        switch(model.getFloor()){
            case 0: elevator.setLocation(0,hh*3/4); break;
            case 1: elevator.setLocation(0,hh/2); break;
            case 2: elevator.setLocation(0,hh/4); break;
            case 3: elevator.setLocation(0,0); break;
        }
    }
    public void setFDoor() {
        if(model.frontIsOpen()) {
            fDoor.setBackground(Color.red);
        }else{
            fDoor.setBackground(Color.blue);
        }
    }
    public void setBDoor() {
        if(model.backIsOpen()) {
            bDoor.setBackground(Color.red);
        }else{
            bDoor.setBackground(Color.blue);
        }
    }
    public void setPeople() {
        if(model.getOccupantCount()<=6){
            p1.setLocation(-50,-50);
            p2.setLocation(-50,-50);
            p3.setLocation(-50,-50);
            p4.setLocation(-50,-50);
            p5.setLocation(-50,-50);
            p6.setLocation(-50,-50);
            switch(model.getOccupantCount()){
                case 6: p6.setLocation(20,hh/6);
                case 5: p5.setLocation(20,25);
                case 4: p4.setLocation(20,5);
                case 3: p3.setLocation(ww/10,hh/6);
                case 2: p2.setLocation(ww/10,25);
                case 1: p1.setLocation(ww/10,5);
                default:;
            }
        }
    }
}
        