package pl.sda.behavioral.strategy_and_mediator.StrategiaPrzyklad;

public class SumAggregator implements Aggregator {
    @Override
    public int execute(int current, int number) {
        return current + number;
    }
}
