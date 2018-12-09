package pl.sda.behavioral.command;

public interface BankCommand extends Command {

    public void execute();
    void unDo();
}
