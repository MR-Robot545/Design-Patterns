package DecoratorPattern;

public abstract class Decorator implements Coffeee {
    protected Coffeee WrraperCoffee;
    Decorator (Coffeee obj){
        WrraperCoffee=obj;
    }
    public String GetDescription(){
        return WrraperCoffee.GetDescription();
    }
    public double Cost(){
        return WrraperCoffee.Cost();
    }
}
