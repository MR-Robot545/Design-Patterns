package ObserverPattern;

import ObserverPattern.Observer;

public class Temperture implements Observer {
    private String name;

    public Temperture(String name) {
        this.name = name;
    }
    @Override
    public void update(float temp) {
        System.out.println(name+" received update. Temperature is now: "+temp);
    }
}
