// Facade
public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface(HomeService light, HomeService tv, HomeService airConditioning){
        this.light = light;
        this.tv = tv;
        this.airConditioning = airConditioning;
    }

    public void turnOnAll(){
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
