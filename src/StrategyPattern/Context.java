package StrategyPattern;

public class Context {
    private Strategy obj;

    public void setObj(Strategy obj) {
        this.obj = obj;
    }
    public int ExcuteStrategy(int a,int b){
        return obj.excute(a,b);
    }
}
