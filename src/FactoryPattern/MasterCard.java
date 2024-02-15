package FactoryPattern;

public class MasterCard implements Payment{
    @Override
    public void Pay() {
        System.out.println("You are Pay with MasterCard");
    }
}
