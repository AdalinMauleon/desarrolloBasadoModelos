public class OpenDoorCommand implements Command{
    Door door;

    public OpenDoorCommand(Door door){
        this.door = door;
    }
    public void execute(){
        door.open();
    }
}
