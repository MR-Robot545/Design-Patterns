package StrategyPattern;

public class Subtraction implements Strategy{
    @Override
    public int excute(int a, int b) {
        return a-b;
    }
}
