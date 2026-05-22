import java.util.List;

public class SugarBeverage extends BeverageDecorator {

    public SugarBeverage(Beverage decoratedBeverage) {

        super(decoratedBeverage);
    }

    @Override
    public List<String> getIngredients() {

        List<String> ingredients = super.getIngredients();

        ingredients.add("sugar");

        return ingredients;
    }

    @Override
    public double getPrice() {

        return super.getPrice() + 1.9;
    }
}
