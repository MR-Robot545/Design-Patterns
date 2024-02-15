package StrategyPattern;

public class Addtion implements Strategy{
    @Override
    public int excute(int a, int b) {
        return a+b;
    }
}
