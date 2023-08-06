package Singleton;
public class Singleton {
    private static Singleton instance;
    private Singleton(){
        //something
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
