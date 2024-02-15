package TemplateMethod;

public class Coffee extends BeverageTemplate{
    @Override
    void AddCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void Brew() {
        System.out.println("Dripping coffee through filter");
    }
}
