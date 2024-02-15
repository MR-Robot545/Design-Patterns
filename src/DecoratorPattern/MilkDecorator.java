package DecoratorPattern;

public class MilkDecorator extends Decorator{
    public MilkDecorator(Coffeee obj) {
        super(obj);
    }
    public String GetDescription(){
        return super.GetDescription()+" Milk";
    }
    public double Cost(){
        return super.Cost()+ 4.0;
    }
}
