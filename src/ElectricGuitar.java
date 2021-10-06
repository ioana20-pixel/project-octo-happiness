import java.util.Scanner;

public class ElectricGuitar {
    public static String level;
    String choice;
    String ea = "Fender Custom Shop 1962 Strat Journeyman Relic";
    String ei = "SubZero Paradigm LH SH 15W";
    String eb = "LA Electric Guitar";

    public ElectricGuitar(String choice){
        this.choice = choice;
    }

    public String toString(String choice, String level) {
        return "Suggestion for " + choice + " guitar:" + level;
    }

    void electric_guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();

        switch (level){
            case "advanced":
                System.out.println(toString(choice,ea));
                break;
            case "intermediate":
                System.out.println(toString(choice,ei));
                break;
            case "begginer":
                System.out.println(toString(choice,eb));
                break;

            default:
                System.out.println("descurca-te");
        }
    }
}
