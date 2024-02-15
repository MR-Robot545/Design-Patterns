package DecoratorPattern;

public class SimpleCoffee implements Coffeee {
    @Override
    public String GetDescription() {
        return "Simple Coffee";
    }

    @Override
    public double Cost() {
        return 7.0;
    }
}
