//Julia Froegel
//Supplier class for BuildingController
public class ElevatorModel {
    int floor, peopleInElevator;
    boolean frontIsOpen, backIsOpen;
    public ElevatorModel() {
        floor=0;
        peopleInElevator=0;
        closeFront();
        closeBack();
    }
    public int getFloor() {
        return floor;
    }
    public boolean frontIsOpen() {
        return frontIsOpen;
    }
    public boolean backIsOpen() {
        return backIsOpen;
    }
    public int getOccupantCount() {
        return peopleInElevator;
    }
    
    public boolean moveUp() {
        if (floor<3) {
            closeFront();
            closeBack();
            floor=floor+1;
            return true;
        }else{
            return false;
        }
    }
    public boolean moveDown() {
        if (floor>0) {
            closeFront();
            closeBack();
            floor=floor-1;
            return true;
        }else{
            return false;
        }
    }
    //I think the doors need to be open for people to get on or off
    public boolean loadPeople(int n) {
        if (n<=8 && ((n+peopleInElevator)<=8)&&(frontIsOpen()||backIsOpen())) {
            peopleInElevator= peopleInElevator+n;
            return true;
        }else{
            return false;
        }
    }
    public boolean exitPeople(int n) {
        if (n<peopleInElevator &&(frontIsOpen()||backIsOpen())) {
            peopleInElevator=peopleInElevator-n;
            return true;
        }else{
            return false;
        }
    }
    public boolean closeFront() {
        frontIsOpen=false;
        return true;

    }
    public boolean openFront() {
        if(floor==0 || floor==2) {
            frontIsOpen=true;
            return true;
        }else{
            return false;
        }
    }
    public boolean closeBack() {
        backIsOpen=false;
        return true;
    }
    public boolean openBack() {
        if(floor==1 || floor==3){
            backIsOpen=true;
            return true;
        }else{
            return false;
        }
    }
}
        
            
    