/* Julia Froegel
 * Controls the whole game and pulls everything together
 * Class Invariant: has a TicTacToeModel and TicTacToeView, and a JFrame 
 * move keeps track of the last move
 */
import javax.swing.JFrame;
import java.awt.Component;
public class TicTacToeController{
    private TicTacToeModel game;
    private TicTacToeView picture;
    private JFrame window;
    private int move;
    /* Preconditon: none
     * Modifies; TicTacToeModel, TicTacToeView, JFrame, and move
     * Postcondition: Runs the whole game. When this is done the game is done
     */
    public TicTacToeController(){
        game=new TicTacToeModel();
        picture=new TicTacToeView(game);
        window=new JFrame("Tic Tac Toe Game");
        window.setBounds(100,100,333,400);
        window.setLayout(null);
        window.setVisible(true);
        window.add(picture.getFrame());
        window.repaint();
        move=-1;
        while(! game.isOver()){
           if(game.whoseTurn()=='X'){
                //System.out.println(game.whoseTurn());
                System.out.println("Where do you want to move? ");
                move=Keyboard.readInt();
                game.move(move);
                //System.out.println(game.returnState());
                picture.lastMove(move);
                picture.modelChanged();
           }else{
                System.out.println(game.whoseTurn());
                computerMove();
                System.out.println("Computer chooses "+move);
           }
            window.repaint();
        }
    }
    /*Precondtion: None
     * Modifies: Move
     * Postconditon: The computer has a vaild move in [0,8]
     */
    public void computerMove(){
        do{
            move=(int)(Math.random()*9);
            if(game.isEmpty(move)){
                game.move(move);
                //System.out.println(game.returnState());
                picture.lastMove(move);
                picture.modelChanged();
            }
        }while(game.isEmpty(move));
    }
}