/* Julia Froegel
 * Veiw of the tic tac toe model
 * Class Invariant: Frame- to hold everything
 * hLine1,hLine2,vLine1,vLine2- form the tic tac toe lines
 *  x1, x2, x3, x4, x5- represent x     // there are 5 x and 4 o cause x goes first so there will be at most 5 x and 4 o
 *  o1,o2,o3, o4-represent o
 * 
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.*;
public class TicTacToeView{
    public static Rectangle frame;
    private Rectangle hLine1,hLine2,vLine1,vLine2, x1, x2, x3, x4,x5;
    private boolean x1IsNotMoved, x2IsNotMoved, x3IsNotMoved, x4IsNotMoved;
    private boolean o1IsNotMoved, o2IsNotMoved,o3IsNotMoved;
    private Oval o1,o2,o3,o4,o5;
    private TicTacToeModel model;
    private static int lastMove;
    private Label stateLabel;
    //private String state;
    
    /* Precondition: a vaild model is provided
     * Modifies: All the variables listed above that would take too long to list
     * Postcondition: The lines are drawn in place, and all the ovals and rectanges are colored 
     * and drawn invsibly tiny, and everything is added to the frame.
     */
    public TicTacToeView(TicTacToeModel m){
        model=m;
        frame= new Rectangle(10,10,313,343);
        frame.setBackground(Color.white);
        hLine1=new Rectangle(0,100,303,5);
        hLine2=new Rectangle(0,201,303,5);
        vLine1=new Rectangle(100,0,5,303);
        vLine2=new Rectangle(201,0,5,303);
        frame.add(hLine1, 0);
        frame.add(hLine2, 0);
        frame.add(vLine1, 0);
        frame.add(vLine2, 0);
        
        x1=new Rectangle(0,0,0,0);
        x1.setBackground(Color.blue);
        x2=new Rectangle(0,0,0,0);
        x2.setBackground(Color.blue);
        x3=new Rectangle(0,0,0,0);
        x3.setBackground(Color.blue);
        x4=new Rectangle(0,0,0,0);
        x4.setBackground(Color.blue);
        x5=new Rectangle(0,0,0,0);
        x5.setBackground(Color.blue);
        frame.add(x1,0);
        frame.add(x2,0);
        frame.add(x3,0);
        frame.add(x4,0);
        frame.add(x5,0);
        
        o1=new Oval(0,0,0,0);
        o1.setBackground(Color.red);
        o2=new Oval(0,0,0,0);
        o2.setBackground(Color.red);
        o3=new Oval(0,0,0,0);
        o3.setBackground(Color.red);
        o4=new Oval(0,0,0,0);
        o4.setBackground(Color.red);
        o5=new Oval(0,0,0,0);
        o5.setBackground(Color.red);
        frame.add(o1,0);
        frame.add(o2,0);
        frame.add(o3,0);
        frame.add(o4,0);
        x1IsNotMoved=true; x2IsNotMoved=true; x3IsNotMoved=true; x4IsNotMoved=true; 
        o1IsNotMoved=true; o2IsNotMoved=true; o3IsNotMoved=true; 
        stateLabel= new Label(model.getStatus());
        stateLabel.setBounds(127,303,100,30);
        frame.add(stateLabel, 0);
    }
    /*precondion:none
     * modifies: none
     * postconditon: gives the frame to controller
     */
    public Rectangle getFrame(){
        return frame;
    }
    /* Preconditon: provided with the last move
     * Modifies: lastMove
     * Postconditon: lastMove= whatever cell is
     */
    public void lastMove(int cell){
        lastMove=cell;
    }
    /*precondition: lastMove is current
     * modifies: none
     * Postconditon: returns the number of the column that the move is in
     */
    public int getColumn(){
        switch(lastMove){
            case 0: return 1;
            case 1: return 2;
            case 2: return 3;
            case 3: return 1;
            case 4: return 2;
            case 5: return 3;
            case 6: return 1;
            case 7: return 2;
            case 8: return 3;
            default:return 0;
        }
    }
    /*precondition: lastMove is current
     * modifies: none
     * Postconditon: returns the number of the row that the move is in
     */
    public int getRow(){
        switch(lastMove){
            case 0: return 1;
            case 1: return 1;
            case 2: return 1;
            case 3: return 2;
            case 4: return 2;
            case 5: return 2;
            case 6: return 3;
            case 7: return 3;
            case 8: return 3;
            default:return 0;
        }
    }
    /*Preconditon: none
     * modifies: all the boolean values
     * Postconditon: the square or circle is moved to the spot corresponding to the move
     */
    public void modelChanged(){
        if(model.whoseTurn()=='O'){
            if(x1IsNotMoved){
                setX(x1,getColumn(),getRow());
                x1IsNotMoved=false;
            }else if(x2IsNotMoved){
                setX(x2,getColumn(),getRow());
                x2IsNotMoved=false;
            }else if(x3IsNotMoved){
                setX(x3,getColumn(),getRow());
                x3IsNotMoved=false;
            }else if(x4IsNotMoved){
                setX(x4,getColumn(),getRow());
                x4IsNotMoved=false;
            }else{
                setX(x5,getColumn(),getRow());
            }
        }else{
            if(o1IsNotMoved){
                setO(o1,getColumn(),getRow());
                o1IsNotMoved=false;
            }else if(o2IsNotMoved){
                setO(o2,getColumn(),getRow());
                o2IsNotMoved=false;
            }else if(o3IsNotMoved){
                setO(o3,getColumn(),getRow());
                o3IsNotMoved=false;
            }else{
                setO(o4,getColumn(),getRow());
            }
        }
        stateLabel.setText(model.getStatus());
    }
            
    /* Precondition: Provieded with a rectangle, and the row and column it is in
     * Modifies:One of the Rectangles
     * Postconditon: Moves and resizes one of the rectangles
     */
    public void setX(Rectangle x, int column, int row){
        x.setBounds(getXCoordinate(column), getYCoordinate(row),75,75);
    }
    /* Precondition: Provieded with a oval, and the row and column it is in
     * Modifies:One of the oval
     * Postconditon: Moves and resizes one of the ovals
     */
    public void setO(Oval o, int column, int row){
        o.setBounds(getXCoordinate(column), getYCoordinate(row),75,75);
    }
    /*Precondition: row is [0,3]
     * Modifies: none
     * Postconditon: Tells the setX or setO how far to put the rectange or oval from the side
     */
    public int getXCoordinate(int column){
        if(column==1){
            return 15;
        }else if(column==2){
            return 115;
        }else{
            return 215;
        }
    }
    /*Precondition: row is [0,3]
     * Modifies: none
     * Postconditon: Tells the setX or setO how far to put the rectange or oval from the top
     */
    public int getYCoordinate(int row){
        if(row==1){
            return 15;
        }else if(row==2){
            return 115;
        }else{
            return 215;
        }
    }
}
        
         