
import Command.DollCommand;
import Command.BikeCommand;
import Observer.Dwarf;
import Observer.MagicBoard;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toy;
        System.out.println("Chose toy: Doll or Bike");
        toy = scanner.nextLine();

        MagicBoard board = MagicBoard.getInstance();
        Dwarf dwarf1 = new Dwarf("Paul");
        Dwarf dwarf2 = new Dwarf("Lebby");

        DollCommand dollCommand = new DollCommand();
        BikeCommand bikeCommand = new BikeCommand();

        board.subscribe(dwarf1);
        board.subscribe(dwarf2);

        if (toy.equals("Doll")) dollCommand.execute();
        if (toy.equals("Bike")) bikeCommand.execute();
        scanner.close();
    }
}
