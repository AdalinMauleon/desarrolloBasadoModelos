import javafx.beans.binding.NumberBinding;
import javafx.scene.control.Dialog;

public class App {
    public static void main(String[] args) throws Exception {
      Operaciones suma = new suma(39,50);
      //Operaciones resta = new resta(100, 7);
      Operaciones multiplicacion = new multiplicacion(5, 10);
      Operaciones division = new division(16, 2);
      Operaciones numeros = new numeros(0, 0);
     // numeros.anadir(resta);
      numeros.anadir(suma);
      numeros.anadir(multiplicacion);
      numeros.anadir(division);
      System.out.println("Total =  " + numeros.operar());

    }
}
