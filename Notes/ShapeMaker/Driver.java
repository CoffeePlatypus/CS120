public class Driver extends JFrame {
    private SizeSlider sizeSlider;
    private ShapeMakerButton shapeButton;
    private Component theComponent;
    private Component [] allComponents;
    private int numberOf Shapes;
    public Driver() {
        super("Driver");
        setLayout(null);
        setSize(500,500);
        
        theComponent=null;
        sizeSlider= new SizeSlider(10,10,120,20,150,this);
        add(sizeSlider,0)
        
        shapeButtton= new ShapeMakerButton(10,10,120,20,150,this);
        add(shapeButton,0);
        numberOfShapes=0;
        
        allComponets= new Componet[50];
        setVisible(true);
        repaint();
        
        
    }
    public void compnentResized(int size) {
        //if(theComponent!=null){
        //    theComponent.setSize(size,size);
        //}
        for (int i=0;i<numberOfShapes;i++){
        }
    }
    public void shapeCreated(Componet c) {
        //theComponent=c;
        allComponents[numberOfShapes++]=c
        add(c,0);
        sizeSlider.setValue(c.getWidth());
        repaint();
    }
    