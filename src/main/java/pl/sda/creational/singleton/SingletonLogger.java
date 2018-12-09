package pl.sda.creational.singleton;

public class SingletonLogger {

    private static SingletonLogger instance;

    private SingletonLogger(){

    }

    public void log (String string){
        System.out.println(string);
    }

    public static SingletonLogger getInstance(){
        if(instance == null){
            instance = new SingletonLogger();
        }
        return instance;
    }
}
