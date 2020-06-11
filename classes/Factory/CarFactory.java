package Factory;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public class CarFactory {
    public static Car buildCar(CarType model){
     Car car = null;
     if(model == CarType.SMALL){
         car = new SmallCar();
     }else if(model == CarType.SEDAN){
         car = new SedanCar();
     }else if(model == CarType.LUXURY){
         car = car = new LuxuryCar();
     }
     return car;
    }
}
