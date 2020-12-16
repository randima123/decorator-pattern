public class CheeseTopping extends Topping {


    public CheeseTopping(Pizza pizza) {
        this.pizza=pizza;
        this.description="Cheese topping";
    }

    @Override
    public String description(){
        return (this.description+" "+this.pizza.description());
    }

    @Override
    public double cost() {
        return this.cost = 150.00 + this.pizza.cost();
    }
}
