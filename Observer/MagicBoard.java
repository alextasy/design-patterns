package Observer;
import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {
    private static MagicBoard instance;
    private List<Observer> dwarfs; // Dwarfs that subscribe to the magic board
    private String currentToy;

    private MagicBoard() {
        this.dwarfs = new ArrayList<>();
    }

    public static MagicBoard getInstance() {
        if (instance == null) instance = new MagicBoard();
        return instance;
    }

    @Override
    public void subscribe(Observer dwarf) {
        this.dwarfs.add(dwarf);
        dwarf.setSubscription(this);
    }

    @Override
    public void unsubscribe(Observer dwarf) {
        this.dwarfs.remove(dwarf);
        dwarf.setSubscription(null);
    }

    @Override
    public void notifyDwarfs() {
        for (Observer dwarf: this.dwarfs) {
            dwarf.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.currentToy;
    }

    public void setCurrentToy(String currentToy) {
        this.currentToy = currentToy;
        this.notifyDwarfs();
    }

}
