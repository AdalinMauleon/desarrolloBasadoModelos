import java.util.Iterator;

public  interface Operaciones{
    
    public  void anadir(Operaciones e);

    public void eliminar(Operaciones e);
          
    public Iterator crearIterator();
  
    public int operar();

}