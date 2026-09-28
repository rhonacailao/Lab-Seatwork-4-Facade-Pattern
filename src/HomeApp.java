interface HomeService {
    void turnOn();
    void turnOff();
}

// Subsystems
class Light implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("Turning on the light..");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off the light..");
    }
}

class TV implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("Turning on the TV..");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off the TV..");
    }
}

class AirConditioning implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("Turning on the AC..");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off the AC..");
    }
}

// Client
public class HomeApp {
    public static void main(String[] args){
        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService airconditioning = new AirConditioning();

        HomeInterface facade = new HomeInterface(light, tv, airconditioning);
        facade.turnOnAll();
        facade.turnOffAll();
    }
}