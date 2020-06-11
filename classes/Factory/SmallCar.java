package Factory;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public class SmallCar extends Car{

    public SmallCar() {
        super(CarType.SMALL);
    }
    
    @Override
    protected void Construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
