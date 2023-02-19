public class App {

	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/03/2023", "08/03/2023", "Veracruz", "Cancún");

		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("06/06/2023", "10/08/2018", "Puebla", "California");
	}

}