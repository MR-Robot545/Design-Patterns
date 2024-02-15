package FactoryPattern;

public class Visa implements Payment{
    @Override
    public void Pay() {
        System.out.println("You are Pay with Visa");
    }
}
