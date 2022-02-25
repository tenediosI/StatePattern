package TrafficLight;

public class RedState implements ColourState{

    private TrafficLight trafficLight;

    public RedState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    public void setState(){
        this.trafficLight.setColourState(new GreenState(this.trafficLight));
    }

    public String getColour(){
        return LightColour.RED.getColour();
    }
}
