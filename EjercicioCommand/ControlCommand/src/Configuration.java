public class Configuration {
    public static void configurar(HouseRemote hr){
            Light light = new Light();
            Door door = new Door();
            Program program = new Program();


            hr.setBoton1(new LightsOnCommand(light));
            hr.setBoton2(new LightsOffCommand(light));
            hr.setBoton3(new OpenDoorCommand(door));
            hr.setBoton4(new CloseDoorCommand(door));
            hr.setBoton5(new ExitProgram(program));

    }
}
