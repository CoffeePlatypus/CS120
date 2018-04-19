import java.awt
import java.scanner.utl
public class OvalSizeField extends EventTextField{
    private Oval oval;
    public OvalSizeField(int x, int y, int w, int h, Oval c){
        super("Oval");
        setBounds(x,y,w,h);
        oval=c;
    }
    