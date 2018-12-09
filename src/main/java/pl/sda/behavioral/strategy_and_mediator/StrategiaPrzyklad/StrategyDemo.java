package pl.sda.behavioral.strategy_and_mediator.StrategiaPrzyklad;

import java.util.Random;

public class StrategyDemo {
    public static void main(String[] args) {

        Calcullus calcullus = new Calcullus(new SumAggregator());
        System.out.println("Adding numbers");
        doIt(calcullus);
        System.out.println("Minus numbers");
        calcullus.setAggregator(new MinusAggregator());
        doIt(calcullus);


    }

    private static void doIt(Calcullus calcullus){
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            calcullus.execute(random.nextInt(20));
            System.out.println("Current" + calcullus.getCurrentNumber());
        }
    }
}
