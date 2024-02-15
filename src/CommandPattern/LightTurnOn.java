package CommandPattern;

public class LightTurnOn implements Command{
    Receiver obj;

    public LightTurnOn(Receiver light) {
        this.obj=light;
    }

    @Override
    public void excute() {
        obj.TurnOn();
    }
}
