import java.util.ArrayList;
import java.util.List;

// Pizza
abstract class Pizza {
    String name;
    List<String> toppings = new ArrayList<String>();
    
    public String getName() {
     return name;
    }
   
    public void prepare() {
      System.out.println("... ");
      System.out.println("Preparing " + name);
    }
   
    public void bake() {
        System.out.println("... ");
        System.out.println("Baking " + name);
    }
   
    public void cut() {
        System.out.println("... ");
        System.out.println("Cutting " + name);
    }
   
    public void box() {
        System.out.println("... ");
        System.out.println("Boxing " + name);
        System.out.println("... ");
    }
   
    public void addToppingStyle(String topping) {
     toppings.add("Our unique touch : " + topping + ", OUR ORIGINAL STYLE");
    }
   
    public String toString() {
     StringBuffer display = new StringBuffer();
     System.out.println(" **** " + name + " with " + "toppings: *** ");
   
     for(String topping : toppings)
      display.append("\t" + topping + "\n");
     display.append("It's ready to eat or take away!!!!");
   
     return display.toString();
    }
   }
