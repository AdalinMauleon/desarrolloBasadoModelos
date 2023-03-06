public class App {
    public static void main(String[] args) throws Exception {
        Pizza NewPizza;
        PizzaStore pizzaStore;

        // Pizza New York
        pizzaStore = new NYPizzaStore();
        NewPizza = pizzaStore.orderPizza("veggie");
        System.out.println(NewPizza);
        
        pizzaStore = new NYPizzaStore();
        NewPizza = pizzaStore.orderPizza("pepperoni");
        System.out.println(NewPizza);

       

        // Pizza Chicago
        pizzaStore = new ChicagoPizzaStore();
        NewPizza = pizzaStore.orderPizza("cheese");
        System.out.println(NewPizza);

        pizzaStore = new ChicagoPizzaStore();
        NewPizza = pizzaStore.orderPizza("clam");
        System.out.println(NewPizza);


    }
}
