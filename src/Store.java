import java.util.Scanner;

public class Store {
    private static AcousticGuitar AcousticGuitar;
    private static ElectricGuitar ElectricGuitar;
    private static ClassicGuitar ClassicGuitar;
    private static Bass Bass;

    public static void main(String[] args) {
        System.out.println("What kind of guitar do you need?");

        Scanner scan = new Scanner(System.in);

        String choice = scan.nextLine();

        String guitar;

        switch (choice) {
            case "acoustic":
                AcousticGuitar.getClass();

                // Perform "original number" case.
                break;
            case "electric":
                ElectricGuitar.getClass();
                // Perform "encrypt number" case.
                break;
            case "classic":
                ClassicGuitar.getClass();
                // Perform "decrypt number" case.
                break;
            case "bass":
                Bass.getClass();
                // Perform "quit" case.
                break;

        }
    }
}
