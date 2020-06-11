package Builder;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public interface MealBuilder {
    public void addSandwich(String sandwich);
    public void addSide(String sides);
    public void addDrink(String drink);
    public void addOffer(String offer);
    public void setPrice(double price);
    public Meal getModel();
}
