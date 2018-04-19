//Julia Froegel
//Client class that uses ElevatorModel to control multiple elevators
import javax.swing.JFrame;
public class BuildingController {
    ElevatorModel elevatorN, elevatorS, elevatorW;
    ElevatorView elevatorPictN, elevatorPictS, elevatorPictW;
    public BuildingController() {
        elevatorN=new ElevatorModel();
        elevatorS=new ElevatorModel();
        elevatorW=new ElevatorModel();
        JFrame window= new JFrame("Building");
        window.setLayout(null);
        window.setBounds(20,20,400,500);
        window.setVisible(true);
        elevatorPictN= new ElevatorView(230,25,40,250, elevatorN);
        elevatorPictW= new ElevatorView(280,25,40,250, elevatorW);
        elevatorPictS= new ElevatorView(330,25,40,250, elevatorS);
        window.add(elevatorPictN.getContainer(),0);
        window.add(elevatorPictW.getContainer(),0);
        window.add(elevatorPictS.getContainer(),0);        
        
        DownButton downN=new DownButton(10,25,100,20,elevatorN,elevatorPictN);
        window.add(downN,0);
        UpButton upN=new UpButton(110,25,100,20,elevatorN,elevatorPictN);
        window.add(upN,0);
        OpenFrontButton frontOpenN=new OpenFrontButton(10,45,100,20,elevatorN,elevatorPictN);
        window.add(frontOpenN,0);
        CloseFrontButton frontCloseN=new CloseFrontButton(110,45,100,20,elevatorN,elevatorPictN);
        window.add(frontCloseN,0);
        OpenBackButton backOpenN=new OpenBackButton(10,65,100,20,elevatorN,elevatorPictN);
        window.add(backOpenN,0);
        CloseBackButton backCloseN=new CloseBackButton(110,65,100,20,elevatorN,elevatorPictN);
        window.add(backCloseN,0);
        LoadOneButton load1N=new LoadOneButton(10,85,100,20,elevatorN,elevatorPictN);
        window.add(load1N,0);
        ExitOneButton exit1N=new ExitOneButton(110,85,100,20,elevatorN,elevatorPictN);
        window.add(exit1N,0);
        
        DownButton downW=new DownButton(10,110,100,20,elevatorW,elevatorPictW);
        window.add(downW,0);
        UpButton upW=new UpButton(110,110,100,20,elevatorW,elevatorPictW);
        window.add(upW,0);
        OpenFrontButton frontOpenW=new OpenFrontButton(10,130,100,20,elevatorW,elevatorPictW);
        window.add(frontOpenW,0);
        CloseFrontButton frontCloseW=new CloseFrontButton(110,130,100,20,elevatorW,elevatorPictW);
        window.add(frontCloseW,0);
        OpenBackButton backOpenW=new OpenBackButton(10,150,100,20,elevatorW,elevatorPictW);
        window.add(backOpenW,0);
        CloseBackButton backCloseW=new CloseBackButton(110,150,100,20,elevatorW,elevatorPictW);
        window.add(backCloseW,0);
        LoadOneButton load1W=new LoadOneButton(10,170,100,20,elevatorW,elevatorPictW);
        window.add(load1W,0);
        ExitOneButton exit1W=new ExitOneButton(110,170,100,20,elevatorW,elevatorPictW);
        window.add(exit1W,0);
        
        DownButton downS=new DownButton(10,195,100,20,elevatorS,elevatorPictS);
        window.add(downS,0);
        UpButton upS=new UpButton(110,195,100,20,elevatorS,elevatorPictS);
        window.add(upS,0);
        OpenFrontButton frontOpenS=new OpenFrontButton(10,215,100,20,elevatorS,elevatorPictS);
        window.add(frontOpenS,0);
        CloseFrontButton frontCloseS=new CloseFrontButton(110,215,100,20,elevatorS,elevatorPictS);
        window.add(frontCloseS,0);
        OpenBackButton backOpenS=new OpenBackButton(10,235,100,20,elevatorS,elevatorPictS);
        window.add(backOpenS,0);
        CloseBackButton backCloseS=new CloseBackButton(110,235,100,20,elevatorS,elevatorPictS);
        window.add(backCloseS,0);
        LoadOneButton load1S=new LoadOneButton(10,255,100,20,elevatorS,elevatorPictS);
        window.add(load1S,0);
        ExitOneButton exit1S=new ExitOneButton(110,255,100,20,elevatorS,elevatorPictS);
        window.add(exit1S,0);
    }
}
        
        
    
        