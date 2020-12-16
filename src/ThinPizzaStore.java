public class ThinPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza() {

        Pizza thinPizza = new ThinCrustPizza();
        return thinPizza;
    }
}
