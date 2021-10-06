import java.util.Scanner;

public class Bass {
    public static String level;
    String choice;
    String ba = "Fender Squier Classic Vibe 70s";
    String bi = "Ibanez GSRM20L-BK";
    String bb = "Pasadena STB-150";

    public Bass(String choice){
        this.choice = choice;
    }

    public String toString(String choice, String level) {
        return "Suggestion for " + choice + " guitar:" + level;
    }

    void bass_guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();

        switch (level){
            case "advanced":
                System.out.println(toString(choice,ba));
                break;
            case "intermediate":
                System.out.println(toString(choice,bi));
                break;
            case "begginer":
                System.out.println(toString(choice,bb));
                break;
            default:
                System.out.println("descurca-te");
        }
    }
}