package FactoryPattern;

public class CreateMasterCard implements Factory{
    @Override
    public Payment Create() {
        return new MasterCard();
    }
}
