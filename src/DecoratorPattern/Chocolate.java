package DecoratorPattern;

public class Chocolate extends Decorator{
    public Chocolate(Coffeee obj) {
        super(obj);
    }
    public String GetDescription(){
        return super.GetDescription()+" Chocolate";
    }
    public double Cost(){
        return super.Cost()+ 5.0;
    }
}
