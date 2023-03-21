import java.util.Iterator;

public class suma implements Operaciones {

    int x, y;
    public suma(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int operar() {
        return x + y ;
    }

    @Override
    public void anadir(Operaciones e) {
       
    }

    @Override
    public void eliminar(Operaciones e) {
        
    }

    @Override
    public Iterator crearIterator() {
        return null;
        
    }

    
}
