/* Julia Froegel
 * Supplier class for tic tac toe game
 * Class Invariant
 * State is in [0,221221110]    //Moving a X into 8 makes state= 000000001
 */
public class TicTacToeModel{
    private int state;
    /* Constructor
     * Precondition: None
     * Modifies: state
     * Postcondition: State=0
     */
    public TicTacToeModel(){
        state=0;
    }
    public int getState(){
        return state;
    }
    /* Precondition: Cell is in [0,8]
     * Modifies: 
     * Postcondition: Returns X if the value of number at the cell is 1, returns
     * O if the value is 2, or it returns empty
     */
    public char getCellValue(int cell){
        int digit=8-cell;
        digit=((int)(state/ Math.pow(10,digit)));
        while(digit>2){
            digit=digit-10;
        }
        if( digit==1){
            return 'X';
        }else if( digit==2){
            return 'O';
        }else{
            return ' ';
        }
    }
    /* Precondition: Cell is in [0,8], and cell where player desiers to move must be empty
     * Modifies: State
     * Postcondition: State is increased by (10^(8-cell)) if it is X's turn
     * and 2(10^(8-cell)) if it is O's turn.
     */
    public void move(int cell){
        if(isEmpty(cell)){
            if(whoseTurn()=='X'){
                state=state+((int)(Math.pow(10,8-cell)));
            }else{
                state=state+(2*((int)(Math.pow(10,8-cell))));
            }
        }
    }
    /* Precondition: Cell is in [0,8]
     * Modifies:
     * Postcondition: Returns true if cell is empty
     */
    public boolean isEmpty(int cell){
        return (getCellValue(cell)==' ');
    }
    /* Precondition: none
     * Modifies:
     * Postconditon: returns either X or O
     */
    public char whoseTurn(){
        int xCount=0;
        int oCount=0;
        for(int i=0; i<=8; i++){
            if(getCellValue(i)=='X'){
                xCount++;
            }else if(getCellValue(i)=='O'){
                oCount++;
            }else{
                //cell is empty
            }
        }
        if(xCount>oCount){
            return 'O';
        }else{
            return 'X';
        }
    }
    public int returnState(){
        int x=state;
        return x;
    }
    /* Precondition: none
     * Modifies: none
     * Postcondition: Returns true or false depending on if the game is over
     */
    public boolean isOver(){
        String status= getStatus();
        return !status.equals("Not Over");
    }
    /* Precondition: None
     * Modifies: none
     * Postcondition: Returns X or O Wins if they win or tie if
     * all the cells are filled with no winner and not over if any cells are empyty
     */
    public String getStatus(){
        String result= checkForWin(0,1,2) + checkForWin(3,4,5) + checkForWin(6,7,8) + checkForWin(0,4,8) + checkForWin(2,4,6) + checkForWin(0,3,6) + checkForWin(1,4,7) +checkForWin(2,5,8);
        if( ! result.equals("")){
            return result;
        }else if(isEmpty(0) || isEmpty(1) || isEmpty(2) || isEmpty(3) || isEmpty(4) || isEmpty(5) || isEmpty(6) || isEmpty(7) || isEmpty(8)){
            return "Not Over";
        }else{
            return "Tie";
        }
    }
    /* Precondition: gets 3 numbers in [0,8]
     * Modifies: none
     * Postconditon: Checks the for wins at the locations the numbers specify
     */
    public String checkForWin(int a, int b, int c){
        if(getCellValue(a)==getCellValue(b) && getCellValue(b)==getCellValue(c) && getCellValue(a)!= ' '){
            return getCellValue(a)+ " Wins";
        }else{
            return "";
        }
    }
}
    