//Julia Froegel
//Random number guessing game.
public class GuessTheNumber {
    public static void main(String [] args) {
        boolean again=true;
        do{
            int randomNum=(int)(Math.random()*101);
            //System.out.println(randomNum);
            int guessTime=1;
            int guessedNum=-1;
        
            while(guessTime<8) {
                if (guessedNum==randomNum){
                    guessTime=8;
                }else{
                    System.out.print('\n'+"Guess a number between 0 and 100: ");
                    guessedNum=Keyboard.readInt();
                    if(guessedNum==randomNum){
                        if(guessTime==1){
                            System.out.print('\n'+"You won in 1 guess");
                        }else{
                            System.out.print('\n'+"You won in "+guessTime+" guesses");
                        }
                    }else if(guessedNum>randomNum){
                        System.out.print('\n'+"Your guess is too high ");
                    }else{
                        System.out.print('\n'+"Your guess is too low ");
                    }
                    guessTime++;
                }
            }
            if(guessTime<8){
                System.out.print('\n'+"You lost");
                System.out.print('\n'+"Would you like to play again (true/false)? ");
                again=Keyboard.readBoolean();
            }else{
                System.out.print('\n'+"Would you like to play again (true/false)? ");
                again=Keyboard.readBoolean();
            }
        }while(again);
    }
}
            