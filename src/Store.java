import java.util.Scanner;

public class Store {



    public static void main(String[] args) {

        System.out.println("What kind of guitar do you need?");

        Scanner scan = new Scanner(System.in);

        String choice = scan.nextLine();
        AcousticGuitar ac = new AcousticGuitar(choice);
        ElectricGuitar el = new ElectricGuitar(choice);
        ClassicGuitar cl = new ClassicGuitar(choice);
        Bass bs = new Bass(choice);
        switch (choice) {
            case "acoustic":
                ac.acoustic_guitar_level();
                break;
            case "electric":
                el.electric_guitar_level();
                break;
            case "classic":
                cl.classic_guitar_level();
                break;
            case "bass":
                bs.bass_guitar_level();
                break;

        }
    }
}
