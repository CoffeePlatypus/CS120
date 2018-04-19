//Julia Froegel
//Makes a model to play tic tac toe
public class TicTacToeModel {
    private String cells;
    public TicTacToeModel() {
        cells="         ";
    }
    public char getCellValue(int cell) {
        return cells.charAt(cell);
    }
    public void move(int cell) {
        if(isEmpty(cell)){
            String p1=cells.substring(0,cell);
            String p2=cells.substring(cell+1,9);
            cells=p1+whoseTurn()+p2;
            //cells=p1+"X"+p2;
        }
        
    }
    public boolean isEmpty(int cell) {
        return getCellValue(cell)==' ';
    }
    public char whoseTurn(){
        String cellsCopyX=cells;
        int countX=0;
        int indexX=cellsCopyX.indexOf('X');
        while(indexX>=0) {
            countX+=1;
            cellsCopyX=cellsCopyX.substring(indexX+1,cellsCopyX.length());
            indexX=cellsCopyX.indexOf('X');
        }
        String cellsCopyO=cells;
        int countO=0;
        int indexO=cellsCopyO.indexOf('O');
        while(indexO>=0) {
            countO+=1;
            cellsCopyO=cellsCopyO.substring(indexO+1,cellsCopyO.length());
            indexO=cellsCopyO.indexOf('O');
        }
        if(countX==countO) {
            return 'X';
        }else{
            return 'O';
        }
    }
    public boolean isOver() {
        return (!(isEmpty(0)|| isEmpty(1)|| isEmpty(2)|| isEmpty(3)||isEmpty(4)|| isEmpty(5) || isEmpty(6) || isEmpty(7) || isEmpty(8)));
    }
    public boolean xWins(){ 
        if("XXX".equals(cells.substring(0,3))){
            return true;
        }else if("XXX".equals(cells.substring(3,6))){
            return true;
        }else if("XXX".equals(cells.substring(6,9))){
            return true;
        }else if(cells.charAt(0)=='X'&&cells.charAt(4)=='X'&&cells.charAt(8)=='X'){
            return true;
        }else if(cells.charAt(6)=='X'&&cells.charAt(4)=='X'&&cells.charAt(2)=='X'){
            return true;
        }else if(cells.charAt(0)=='X'&&cells.charAt(3)=='X'&&cells.charAt(4)=='X'){
            return true;
        }else if(cells.charAt(1)=='X'&&cells.charAt(4)=='X'&&cells.charAt(7)=='X'){
            return true;
        }else if(cells.charAt(2)=='X'&&cells.charAt(5)=='X'&&cells.charAt(8)=='X'){
            return true;
        }else{
            return false;
        }
    }
    public boolean oWins(){
        if("OOO".equals(cells.substring(0,3))){
            return true;
        }else if("OOO".equals(cells.substring(3,6))){
            return true;
        }else if("OOO".equals(cells.substring(6,9))){
            return true;
        }else if(cells.charAt(0)=='O'&&cells.charAt(4)=='O'&&cells.charAt(8)=='O'){
            return true;
        }else if(cells.charAt(6)=='O'&&cells.charAt(4)=='O'&&cells.charAt(2)=='O'){
            return true;
        }else if(cells.charAt(0)=='O'&&cells.charAt(3)=='O'&&cells.charAt(4)=='O'){
            return true;
        }else if(cells.charAt(1)=='O'&&cells.charAt(4)=='O'&&cells.charAt(7)=='O'){
            return true;
        }else if(cells.charAt(2)=='O'&&cells.charAt(5)=='O'&&cells.charAt(8)=='O'){
            return true;
        }else{
            return false;
        }
          }
    public String getStatus(){
        if(xWins()){
            return "X Wins";
        }else if(oWins()){
            return "O Wins";
        }else if(isOver()){
            return "Tie";
        }else{
            return "Not Over";
        }
    }
}


    
        
    