public class ThickPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza() {

        Pizza thickPizza = new ThickCrustPizza();
        return thickPizza;
    }
}