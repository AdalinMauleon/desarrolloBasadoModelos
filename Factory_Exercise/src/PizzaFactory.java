// Factory
class PizzaFactory {
    Pizza pizza;
   
    public void pizzaSteps() {
     pizza.prepare();
     pizza.bake();
     pizza.cut();
     pizza.box();
    }
   
    public Pizza createPizza(String type, String style) {
     switch(type) {
      case "cheese":
       pizza  = new CheesePizza();
       pizzaSteps();
      break;
      case "pepperoni":
       pizza  = new PepperoniPizza();
       pizzaSteps();
      break;
      case "veggie":
       pizza  = new VeggiePizza();
       pizzaSteps();
      break;
      case "clam":
       pizza  = new ClamPizza();
       pizzaSteps();
      break;
      default:
       System.out.println("Soon, that taste ;) (Ask it to our service client)");
     }  
     
     return pizza;
    }
   }
