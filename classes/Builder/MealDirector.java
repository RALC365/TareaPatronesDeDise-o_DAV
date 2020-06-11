package Builder;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public class MealDirector {
    public MealDirector(){}
    
    public void makeMeal(MealBuilder mealBuilder){
        mealBuilder.addSandwich("Taco Mexicano");
        mealBuilder.addDrink("Copan Drive");
        mealBuilder.addOffer("Bebidas 2x1");
        mealBuilder.setPrice(130);
        mealBuilder.addSide("Papitas");
        System.out.println(mealBuilder.getModel().toString());
    }
}
