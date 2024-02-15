package CommandPattern;

public class Remote {
    Command obj;

    public void setObj(Command obj) {
        this.obj = obj;
    }
    public void perform(){
        obj.excute();
    }
}
