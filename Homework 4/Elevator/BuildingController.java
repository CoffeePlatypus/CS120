//Julia Froegel
//Client class that uses ElevatorModel to control multiple elevators
public class BuildingController {
    static ElevatorModel elevatorN, elevatorS, elevatorW;
    public static void main(String[] args) {
        elevatorN=new ElevatorModel();
        elevatorS=new ElevatorModel();
        elevatorW=new ElevatorModel();
        boolean keepControlling=true;
        int menuChoice;
        
        while(keepControlling){
            menuChoice=getFirstMenuChoice();
            if(menuChoice==8){
                keepControlling=false;
            }else{
                if(!(applyOperation(menuChoice,getSelectedElevator()))){
                    System.out.println("ERROR: Illegal operation");                    
                }
                printState();
            }          
        }
        
    }
    public static ElevatorModel getSelectedElevator() {
        System.out.print("Select elevator(N, S, or W): ");
        char choice=Keyboard.readChar();
        if(choice=='N'){
            return elevatorN;
        }else if(choice=='S'){
            return elevatorS;
        }else{
            return elevatorW;
        }
        
    }
    public static int getFirstMenuChoice() {
        System.out.println("Menu:");
        System.out.println("0) Move up one floor");
        System.out.println("1) Move down one floor");
        System.out.println("2) Open Front door");
        System.out.println("3) Close Front door");
        System.out.println("4) Open Back door");
        System.out.println("5) Close Back door");
        System.out.println("6) People enter");
        System.out.println("7) People leave");
        System.out.println("8) Quit");
        System.out.println("Menu Choice: ");
        int choice=Keyboard.readInt();
        return choice;
    }
    public static boolean applyOperation(int menuChoice, ElevatorModel elevator){
        boolean isValidOperation;
        switch(menuChoice){
            case 0: isValidOperation=elevator.moveUp(); break;
            case 1: isValidOperation=elevator.moveDown(); break;
            case 2: isValidOperation=elevator.openFront(); break;
            case 3: isValidOperation=elevator.closeFront(); break;
            case 4: isValidOperation=elevator.openBack(); break;
            case 5: isValidOperation=elevator.closeBack(); break;
            case 6: isValidOperation=elevator.loadPeople(howManyPeople()); break;
            case 7: isValidOperation=elevator.exitPeople(howManyPeople());break;
            default: isValidOperation=false;
        }
        return isValidOperation;        
    }
    public static void printState(){
        System.out.println("STATE: ");
        System.out.print("N - Floor: "+elevatorN.getFloor());
        System.out.print("; Front: " + openOrClosed(elevatorN.frontIsOpen()));
        System.out.print("; Back: "+ openOrClosed(elevatorN.backIsOpen()));
        System.out.print("; People: "+elevatorN.getOccupantCount()); 
        System.out.println();
        System.out.print("S - Floor: "+elevatorS.getFloor());
        System.out.print("; Front: " + openOrClosed(elevatorS.frontIsOpen()));
        System.out.print("; Back: "+ openOrClosed(elevatorS.backIsOpen()));
        System.out.print("; People: "+elevatorS.getOccupantCount()); 
        System.out.println();
        System.out.print("W - Floor: "+elevatorW.getFloor());
        System.out.print("; Front: " + openOrClosed(elevatorW.frontIsOpen()));
        System.out.print("; Back: "+ openOrClosed(elevatorW.backIsOpen()));
        System.out.print("; People: "+elevatorW.getOccupantCount());
        System.out.println();
    }
    public static int howManyPeople(){
        System.out.println("How many people? ");
        int people=Keyboard.readInt();
        return people;
    }
    public static String openOrClosed(boolean isOpen){
        if(isOpen){
            return "Open";
        }else{
            return "Closed";
        }
    }        
}
        
        
    
        