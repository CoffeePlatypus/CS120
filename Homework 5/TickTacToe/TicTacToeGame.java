//Julia Froegel
//Plays a game of tic tac toe
public class TicTacToeGame{
    public static void main(String[] args){
        TicTacToeModel game=new TicTacToeModel();
        System.out.println("Let's play a game of Tic Tac Toe!");
        int move;
        do{
            do{
                move=getMove(game.whoseTurn());
            }while(game.getCellValue(move)!=' ');
            game.move(move);
            if(game.whoseTurn()=='X'){
                System.out.println("The computer chooses "+move);
            }
            System.out.println();
            System.out.println(game.getCellValue(0)+"|"+game.getCellValue(1)+"|"+game.getCellValue(2));
            System.out.println("--------");
            System.out.println(game.getCellValue(3)+"|"+game.getCellValue(4)+"|"+game.getCellValue(5));
            System.out.println("--------");
            System.out.println(game.getCellValue(6)+"|"+game.getCellValue(7)+"|"+game.getCellValue(8));
        }while(!game.isOver()||!game.xWins()||!game.oWins());
        game.getStatus();
    }
    public static int getMove(char player){
        if(player=='X'){
            System.out.println("Where do you want to move?");
            return Keyboard.readInt();
        }else if(player=='O'){
            return(int)(Math.random()*9);
        }else{
            System.out.print("Error");
            return 0;
        }
    }
}
        