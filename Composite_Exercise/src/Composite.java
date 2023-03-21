import java.util.ArrayList;
import java.util.Iterator;


class Composite implements Operaciones {
 int x, y;
     ArrayList<Operaciones> listaComponente = new ArrayList<>();

     @Override
    public void anadir(Operaciones e){
        listaComponente.add(e);
    }
    @Override
    public void eliminar(Operaciones e){
        listaComponente.remove(e);
    }
    @Override
    public Iterator crearIterator(){
        return listaComponente.iterator();
    }

    @Override
    public int operar() {
        int total = 0;
        for(Iterator i = crearIterator(); i.hasNext();)
           total+= ((Composite) i.next()).operar();

       return total;
    }

    
    
}