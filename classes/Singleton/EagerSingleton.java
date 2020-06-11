package Singleton;
/**
 * @author Richardson Laínez - 11711075
 */
public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return instance;
    }
}
