package Command;
import Singleton.Santa;

public class BikeCommand implements Command {
    private Santa santa;
    public BikeCommand() {
        this.santa = Santa.getInstance();
    }

    @Override
    public void execute() {
        this.santa.requestBike();
    }
}
