public class Square extends Rectangle {
    public Square(int x, int y, int w) {
        super(x,y,w,w);
    }
    public void setSize(int w, int h) {
        if(w==h) {
            setSize(w,h);
        }
    }
    public boolean equals(Rectangle r) {
        if(getWidth()==r.getWidth()) {
            return true;
        }
        return false;
    }
}