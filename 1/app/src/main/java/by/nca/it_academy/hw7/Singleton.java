package by.nca.it_academy.hw7;

/**
 * Created by user on 09.02.2018.
 */

public class Singleton {
    private static Singleton instance = new Singleton();

    public String text;

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }
}
