package AbstractFactoryPattern;

public class CreateClassic implements AbstractFactory{
    @Override
    public ProductA CreateA() {
        return new ClassicA();
    }

    @Override
    public ProductB CreateB() {
        return new ClassicB();
    }
}
