package FactoryPattern;

public class CreateVisa implements Factory{
    @Override
    public Payment Create() {
        return new Visa();
    }
}
