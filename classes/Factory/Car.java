package Factory;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public abstract class Car {
    CarType model = null;

    public Car(CarType model){
        this.model = model;
    }
    
    protected abstract void Construct();
    
    public CarType getModel(){
        return this.model;
    }
    
    public void setModel(CarType model){
        this.model = model;
    }
}
