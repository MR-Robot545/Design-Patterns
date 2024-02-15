package CommandPattern;

public class LightTurnOff implements Command{
    Receiver obj;

    public LightTurnOff(Receiver light) {
        this.obj=light;
    }

    @Override
    public void excute() {
        obj.TurnOff();
    }
}
