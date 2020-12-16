public class ThinCrustPizza extends Pizza {

    public ThinCrustPizza() {
        this.description="Thin crust pizza";
    }

    @Override
    public String description() {
        return this.description;
    }

    @Override
    public double cost() {
        return this.cost=1500.00;
    }
}
