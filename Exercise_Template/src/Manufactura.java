public abstract class Manufactura {
         

    final void procesar(double largo, double ancho){
        descripcion();
        mostrarDetalles(largo, ancho);
        laminar();
        cortar(largo, ancho);
        darAcabado();
        empaquetar();
    }
    abstract void descripcion();

    public void mostrarDetalles(double largo, double ancho){
        System.out.println("Largo: "+ largo);
        System.out.println("Ancho: "+ ancho);
    }
   
    public void laminar(){
        System.out.println("Laminando piezas");
    }
    public void cortar(double largo, double ancho){
        System.out.println("Cortando piezas de " + largo + " x " + ancho );
    }
    public void darAcabado(){
        System.out.println("Realizando acabado a peticion del cliente");
    }
    public void empaquetar(){
        System.out.println("Empaquetando en grupos de 5 piezas");
    }


}