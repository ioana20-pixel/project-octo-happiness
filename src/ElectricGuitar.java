import java.util.Scanner;

public class ElectricGuitar {
    public static String level;
    public static String name = "Electric guitar";

    private void guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();

        switch (level){
            case "Advanced":
                System.out.println("Suggestion: Fender Custom Shop 1962 Strat Journeyman Relic");
                break;
            case "Intermediate":
                System.out.println("Suggestion: SubZero Paradigm LH SH 15W");
                break;
            case "Begginer":
                System.out.println("Suggestion: LA Electric Guitar");

            default:
                System.out.println("descurca-te");
        }
    }
}
