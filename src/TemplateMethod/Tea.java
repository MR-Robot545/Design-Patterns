package TemplateMethod;

public class Tea extends BeverageTemplate{
    @Override
    void AddCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void Brew() {
        System.out.println("Steeping the tea");
    }
}
