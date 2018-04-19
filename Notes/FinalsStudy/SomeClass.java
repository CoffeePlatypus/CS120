public class SomeClass {
    public SomeClass() {
        
    }
    public Oval biggestOval(Oval[] dots) {
        Oval bigDot=dots[0];
        for(int i=1; i<dots.length; i++) {
            if(bigDot.getWidth()*bigDot.getHeight()<dots[i].getWidth()*dots[i].getHeight()) {
                bigDot=dots[i];
            }
        }
        return bigDot;
    }
    
}