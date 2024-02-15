package TemplateMethod;

abstract class BeverageTemplate {
     public final void prepare(){
        BoilWater();
        Brew();
        PourToCup();
        AddCondiments();
    }

    abstract void AddCondiments();
    abstract void Brew();
    void PourToCup() {
        System.out.println("Pouring into cup");
    }

    void BoilWater() {
        System.out.println("Boiling water");
    }
}
