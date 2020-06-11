package Observer;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyAllObserver();
}
