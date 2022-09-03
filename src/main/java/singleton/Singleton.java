package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

//    making it thread safe
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
