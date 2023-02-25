public class CloseDoorCommand implements Command{
    Door door;

    public CloseDoorCommand(Door door){
        this.door = door;
    }
    public void execute(){
        door.close();
    }
}
