//Surface area of a cone
public class ConeHead{
    public static void main (String[] args){
        double radius;
        double height;
        double pi=3.141592;
        double volumeInches;
        double volumeMeters;
        double surfaceAreaInches;
        double surfaceAreaMeters;
        
        
        
        //get lenths
        System.out.print("Enter radius in inches: ");
        radius=Keyboard.readDouble();
        System.out.print("Enter height in feet: ");
        height=Keyboard.readDouble();
        //convert
        height= height*12;
        //calculate inches
        volumeInches=(Math.PI*radius*radius*height)/3;
        surfaceAreaInches=Math.PI*radius*(radius+(Math.sqrt((radius*radius)+(height*height))));
        
        
        //calculate meters
        volumeMeters= volumeInches/39.3701;
        surfaceAreaMeters= surfaceAreaInches/39.3701;
        
        //output results
        System.out.println("Surface Area: "+ surfaceAreaInches+ " square inches or "+ surfaceAreaMeters+" square meters");
        System.out.println("Volume: "+ volumeInches+" cublic inches or "+volumeMeters+" cublic meters");
    }
}
        
        
        
        