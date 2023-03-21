import java.util.Iterator;

public class division implements Operaciones {

    int x, y;
    public division(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int operar() {
        return x/y ;
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
