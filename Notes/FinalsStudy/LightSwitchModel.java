public class LightSwitchModel {
    private boolean isOn;
    public LightSwitchModel() {
        isOn=false;
    }
    public boolean isOn() {
        return isOn;
    }
    public boolean isOff() {
        return !isOn;
    }
    public boolean flip() {
        isOn=!isOn;
        return isOn;
    }
}
    