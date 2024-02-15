import java.awt.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

import AbstractFactoryPattern.*;
import CommandPattern.*;
import CompositePattern.*;
import CompositePattern.Rectangle;
import CompositePattern.Shape;
import DecoratorPattern.*;
import FacadePattern.Facade;
import FactoryPattern.*;
import ObserverPattern.Observer;
import ObserverPattern.WeatherStation;
import StrategyPattern.Addtion;
import StrategyPattern.Context;
import StrategyPattern.Multiplication;
import StrategyPattern.Subtraction;
import TemplateMethod.Coffee;
import TemplateMethod.Tea;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        // observer pattern
        /*
            Observer user1=new ObserverPattern.Temperture("user1");
            Observer user2=new ObserverPattern.Temperture("user2");
            WeatherStation s = new ObserverPattern.WeatherStation();
            s.AddUser(user1);
            s.AddUser(user2);
            s.setTemp(15.0F);
            s.RemoveUser(user1);
            s.notifyUsers();
        */

        //Strategy Pattern
        /*
            int fnum,snum;
            String oper;
            fnum=in.nextInt();
            snum=in.nextInt();
            oper=in.next();
            Context obj=new Context();
            if(Objects.equals(oper, "+")){
                obj.setObj(new Addtion());
            }else if(Objects.equals(oper, "-")){
                obj.setObj(new Subtraction());
            }else{
                obj.setObj(new Multiplication());
            }
            System.out.println(obj.ExcuteStrategy(fnum,snum));
        */

        // template Method
        /*
            Tea tea=new Tea();
            tea.prepare();
            System.out.println();
            Coffee coffee=new Coffee();
            coffee.prepare();
         */


        // Command Pattern
        /*
            Receiver light=new Receiver();
            Command turnon=new LightTurnOn(light);
            Command turnoff=new LightTurnOff(light);
            Remote R=new Remote();
            R.setObj(turnon);
            R.perform();
            R.setObj(turnoff);
            R.perform();
         */

        // Factory Pattern
        /*
            Factory obj=new CreateVisa();
            Payment visa=obj.Create();

            obj=new CreateMasterCard();
            Payment Master=obj.Create();
            visa.Pay();
            Master.Pay();
        */

        // Abstract Factory
        /*
            AbstractFactory FactoryModern=new CreateModern();
            ProductA ModernA=FactoryModern.CreateA();
            ProductB ModernB=FactoryModern.CreateB();
            ModernA.printType();
            ModernB.printType();

            AbstractFactory FactoryClassic=new CreateClassic();
            ProductA ClassicA=FactoryClassic.CreateA();
            ProductB ClassicB=FactoryClassic.CreateB();
            ClassicA.printType();
            ClassicB.printType();
        */

        //Facade Pattern
        /*
            Facade obj=new Facade();
            obj.MultiMedia();
            obj.ViewImage();
        */

        // Composite Pattern
        /*
            CompositeShape CShape=new CompositeShape();
            Shape Triangle=new Triangle();
            Shape Circle=new Circle();
            Shape Rectangle=new Rectangle();


            System.out.println("Drawing individual shapes:");
            Rectangle.Draw();

            System.out.println("Drawing composite shape:");
            CShape.AddShape(Triangle);
            CShape.AddShape(Circle);
            CShape.Draw();
        */

        // Decorator Pattern
        /*
            Coffeee simple= new SimpleCoffee();
            System.out.println("Description "+simple.GetDescription()+" Cost "+ simple.Cost());

            Coffeee Milk= new MilkDecorator(simple);
            System.out.println("Description "+Milk.GetDescription()+" Cost "+ Milk.Cost());

            Coffeee chocolate= new Chocolate(Milk);
            System.out.println("Description "+chocolate.GetDescription()+" Cost "+ chocolate.Cost());

            Coffeee moreMilk= new MilkDecorator(chocolate);
            System.out.println("Description "+moreMilk.GetDescription()+" Cost "+ moreMilk.Cost());
        */
    }
}