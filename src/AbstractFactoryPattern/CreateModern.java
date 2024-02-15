package AbstractFactoryPattern;

public class CreateModern implements AbstractFactory{
    @Override
    public ProductA CreateA() {
        return new ModernA();
    }

    @Override
    public ProductB CreateB() {
        return new ModernB();
    }
}
