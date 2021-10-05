import javax.xml.stream.events.StartElement;
import java.util.Scanner;

public class AcousticGuitar {
    public static String level;
    String choice;
    String aa = "Martin 000-28 Modern Deluxe";
    String ai = "Martin LX Little Martin Guitar";
    String ab = "Epiphone Pro-1 Acoustic";

    public AcousticGuitar(String choice){
        this.choice = choice;
    }

    public String toString(String choice, String level) {
        return
                "Suggestion for " + choice + " guitar:" + level;
    }
    void acoustic_guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();

        switch (level){
            case "Advanced":
                System.out.println(toString(choice,aa));
                break;
            case "Intermediate":
                System.out.println(toString(choice,ai));
                break;
            case "Begginer":
                System.out.println(toString(choice,ab));

            default:
                System.out.println("descurca-te");
        }
    }

}
