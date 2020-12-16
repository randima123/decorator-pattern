public class Main {

    public static void main(String[] args)
    {
//        Pizza pizza1 = new ThickCrustPizza();
        PizzaStore pizzaStore = new ThickPizzaStore();
        Pizza pizza1 = pizzaStore.createPizza();
        pizza1 = new CheeseTopping(pizza1);
        System.out.println(pizza1.description()+" "+pizza1.cost());

        Pizza pizza2 = new ThinCrustPizza();
        pizza2 = new CheeseTopping(pizza2);
        pizza2 = new OnionTopping(pizza2);
        System.out.println(pizza2.description()+" "+pizza2.cost());


    }
}
