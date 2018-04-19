/* Julia Froegel
 * Controls the whole game and pulls everything together
 * Class Invariant: has a TicTacToeModel and TicTacToeView, and a JFrame 
 * move keeps track of the last move
 */
import javax.swing.JFrame;
import java.awt.Component;
public class TicTacToeTwoPlayerController{
    private TicTacToeModel game;
    private TicTacToeView picture;
    private JFrame window;
    private int move;
    /* Preconditon: none
     * Modifies; TicTacToe
     */
    public TicTacToeTwoPlayerController(){
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
                System.out.println("Where do you want to move "+game.whoseTurn()+" ?");
                move=Keyboard.readInt();
                game.move(move);
                //System.out.println(game.returnState());
                picture.lastMove(move);
                picture.modelChanged();
                window.repaint();
        }
    }
    public void computerMove(){
        do{
            move=(int)(Math.random()*9);
            if(game.isEmpty(move)){
                game.move(move);
                System.out.println(game.returnState());
                picture.lastMove(move);
                picture.modelChanged();
            }
        }while(!game.isEmpty(move));
    }
}