//Julia Froegel
//Divide with out dividing
public class Newton {
    public static void main(String [] args){
        System.out.print("Enter numerator: ");
        double a=Keyboard.readDouble();
        System.out.println();
        System.out.print("Enter denominatior: ");
        double b=Keyboard.readDouble();
        if(b>0){
            double x=0.1;
            for( int n=1; n<8; n++){
                x=x*(2-b*x);
            }
            double division=a*x;
            System.out.println(a+"/"+b+" = "+division);
        }else{
            double x=-0.1;
            for( int n=1; n<8; n++){
                x=x*(2-b*x);
            }
            double division=a*x;
            System.out.println(a+"/"+b+" = "+division);
        }
    }
}

        
        