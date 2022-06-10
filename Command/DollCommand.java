package Command;
import Singleton.Santa;

public class DollCommand implements Command {
    private Santa santa;
    public DollCommand() {
        this.santa = Santa.getInstance();
    }

    @Override
    public void execute() {
        this.santa.requestDoll();
    }
}
