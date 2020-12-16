public class OnionTopping extends  Topping {

    public OnionTopping(Pizza pizza) {
        this.pizza=pizza;
        this.description="Onion topping";
    }

    @Override
    public String description(){
        return (this.description+" "+this.pizza.description());
    }

    @Override
    public double cost() {
        return this.cost = 50.00 + this.pizza.cost();
    }
}



