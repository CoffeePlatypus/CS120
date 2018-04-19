public class SizeSlider extends EventSlider {
    private Driver driver;
    public SizeSlider(int x, int y, int w, int h, int maxWidth, Driver d) {
        super(HORIZONTAL,0, maxWidth,0);
        setBounds(x,y,w,h);
        driver=d;      
        
    }
    public void stateChanged(ChangeEvent ev){
        driver.compnentResize(getValue());
    }
}
        