
public class HouseRemote{
    private Command boton1;
    private Command boton2;
    private Command boton3;
    private Command boton4;
    private Command boton5;

    public void clickboton1(){
        boton1.execute();
    }
    public void clickboton2(){
        boton2.execute();
    }
    public void clickboton3(){
        boton3.execute();
    }
    public void clickboton4(){
        boton4.execute();
    }
    public void clickboton5(){
        boton5.execute();
    }
    public Command getBoton1(){
        return boton1;  
    }
    public void setBoton1(Command boton1){
        this.boton1 = boton1;
    }
    public Command getBoton2(){
        return boton2;
    }
    public void setBoton2(Command boton2){
        this.boton2 = boton2;
    }
    public Command getBoton3(){
        return boton3;
    }
    public void setBoton3(Command boton3){
        this.boton3 = boton3;
    }
    public Command getBoton4(){
        return boton4;
    }
    public void setBoton4(Command boton4){
        this.boton4 = boton4;
    }
    public Command getBoton5(){
        return boton5;
    }
    public void setBoton5(Command boton5){
        this.boton5 = boton5;
    }


}