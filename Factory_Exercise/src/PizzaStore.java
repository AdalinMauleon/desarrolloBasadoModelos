abstract class PizzaStore {
    PizzaFactory factory = new PizzaFactory();  
    Pizza pizza;
    String style = "simple";
   
    public String getStyle() {
     return style; 
    }
   
    public Pizza orderPizza(String type) {
     return factory.createPizza(type, style);
    }
   }
