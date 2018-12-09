package pl.sda.behavioral.strategy_and_mediator.StrategiaPrzyklad;

public class Calcullus {
    private int currentNumber;
    private Aggregator aggregator;

    public Calcullus(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public void execute(int number){
        currentNumber = aggregator.execute(currentNumber, number);
    }

    public Calcullus setAggregator(Aggregator aggregator) {
        this.aggregator = aggregator;
        return this;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }
}
