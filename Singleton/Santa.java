package Singleton;
import Observer.MagicBoard;

public class Santa {
    private static Santa instance;
    private MagicBoard magicBoard;
    private Santa() {
        this.magicBoard = MagicBoard.getInstance();
    }

    public static Santa getInstance() {
        if (instance == null) instance = new Santa();
        return instance;
    }

    public void requestBike() {
        System.out.println("I want a bike!");
        this.magicBoard.setCurrentToy("Bike");
    }

    public void requestDoll() {
        System.out.println("I want a doll!");
        this.magicBoard.setCurrentToy("Doll");
    }
}
