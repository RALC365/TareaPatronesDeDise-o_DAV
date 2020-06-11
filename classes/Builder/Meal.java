package Builder;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public class Meal {
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;
    
    public Meal(){}
    
    public String toString(){
        return sandwich + ", " + sideOrder + ", " + 
                drink + ", " + offer + ", " + price;
    }
}
