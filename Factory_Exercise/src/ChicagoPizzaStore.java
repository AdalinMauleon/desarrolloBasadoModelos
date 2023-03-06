class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
        style = "deep-dish";
       }
        
       public Pizza orderPizza(String type) {
        pizza = factory.createPizza(type, style);
        if(pizza != null) {
         System.out.println("\n\n--------------- Pizza Chicago style --------------");
         pizza.addToppingStyle(style);
        }
        return pizza;
       }
    
}
