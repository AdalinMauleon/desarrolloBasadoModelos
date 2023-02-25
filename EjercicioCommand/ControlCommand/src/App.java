public class App {
    public static void main(String[] args) throws Exception {
       HouseRemote houseRemote = new HouseRemote();

       Configuration.configurar(houseRemote);
       
       houseRemote.clickboton1();
       houseRemote.clickboton2();
       houseRemote.clickboton3();
       houseRemote.clickboton4();
       houseRemote.clickboton5();
    }
}
