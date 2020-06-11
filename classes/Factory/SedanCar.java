package Factory;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public class SedanCar extends Car{

    public SedanCar() {
        super(CarType.SEDAN);
    }
    
    @Override
    protected void Construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
