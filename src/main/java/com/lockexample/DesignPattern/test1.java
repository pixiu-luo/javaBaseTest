package com.lockexample.DesignPattern;

/**
 * 策略模式
 */
public class test1 {

    public static void main(String[] args) {

        Context context;
        context = new Context(new StrategyA());
        context.algorithmInterface();
        context = new Context(new StrategyB());
        context.algorithmInterface();
        context = new Context(new StrategyC());
        context.algorithmInterface();

    }

    static abstract class Strategy {

        // 算法方法
        abstract void algorithmInterface();

    }

    static class StrategyA extends Strategy {

        @Override
        void algorithmInterface() {
            System.out.println("算法A");

        }

    }

    static class StrategyB extends Strategy {

        @Override
        void algorithmInterface() {
            System.out.println("算法B");

        }

    }

    static class StrategyC extends Strategy {

        @Override
        void algorithmInterface() {
            System.out.println("算法C");

        }

    }

    // 使用上下文维护算法策略
    static class Context {

        Strategy strategy;

        public Context(Strategy strategy) {
            this.strategy = strategy;
        }

        public void algorithmInterface() {
            strategy.algorithmInterface();
        }

    }

}
