class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {
     style = "hand-tossed thin crust";
    }
   
    public Pizza orderPizza(String type) {
     pizza = factory.createPizza(type, style);
     if(pizza != null) {
      System.out.println("\n\n--------------- Pizza New York style --------------");
      pizza.addToppingStyle(style);
     }
     return pizza;
    }
   }
   