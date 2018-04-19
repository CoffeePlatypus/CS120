public class TrafficLightModel{
    private boolean isRedOn, isYellowOn, isGreenOn;
    public TrafficLightModel(){
        isRedOn=true;
        isYellowOn=false;
        isGreenOn=false;
    }
    public void changeColor(){
        if (isRedOn){
            isRedOn=false;
            isGreenOn=true;
        }else if(isGreenOn){
            isGreenOn=false;
            isYellowOn=true;
        }else{
            isYellowOn=false;
            isRedOn=true;
        }
    }
    public boolean isRed(){
        return isRedOn;
    }
    public boolean isGreen(){
        return isGreenOn;
    }
    public boolean isYellow(){
        return isYellowOn;
    }
}
        