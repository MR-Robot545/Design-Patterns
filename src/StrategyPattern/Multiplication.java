package StrategyPattern;

public class Multiplication implements Strategy{
    @Override
    public int excute(int a, int b) {
        return a*b;
    }
}
