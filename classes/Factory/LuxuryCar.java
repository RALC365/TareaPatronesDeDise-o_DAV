package Factory;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public class LuxuryCar extends Car{
    LuxuryCar() {
        super(CarType.LUXURY);
    }
    
    @Override
    protected void Construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
