package StrategyPattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("30 + 10 = " + context.executeStrategy(30, 10));

        context = new Context(new OperationSubstract());
        System.out.println("30 - 10 = " + context.executeStrategy(30, 10));

        context = new Context(new OperationMultiply());
        System.out.println("30 * 10 = " + context.executeStrategy(30, 10));

        context = new Context(new OperationDivide());
        System.out.println("30 / 10 = " + context.executeStrategy(30, 10));
    }
}