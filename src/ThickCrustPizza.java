public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        this.description="Thick crust pizza";
    }

    @Override
    public String description() {
        return this.description;
    }

    @Override
    public double cost() {
        return this.cost=1800.00;
    }
}
