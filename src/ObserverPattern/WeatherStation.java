package ObserverPattern;

import java.util.ArrayList;

public class WeatherStation implements Subject{ //store


    private float Temp;
    private ArrayList<Observer>Users=new ArrayList<Observer>();
    public void setTemp(float temp) {
        Temp = temp;
    }
    @Override
    public void AddUser(Observer obj) {
        Users.add(obj);
    }

    @Override
    public void RemoveUser(Observer obj) {
        Users.remove(obj);
    }

    @Override
    public void notifyUsers() {
        for(Observer u:Users){
            u.update(Temp);
        }
    }
}
