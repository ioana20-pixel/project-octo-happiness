import javax.xml.stream.events.StartElement;
import java.util.Scanner;

public class AcousticGuitar {
    public static String level;
    public static String name = "Acoustic guitar";

    private void guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();

        switch (level){
            case "Advanced":
                System.out.println("Suggestion: Martin 000-28 Modern Deluxe");
                break;
            case "Intermediate":
                System.out.println("Suggestion: Martin LX Little Martin Guitar");
                break;
            case "Begginer":
                System.out.println("Suggestion: Epiphone Pro-1 Acoustic");

            default:
                System.out.println("descurca-te");
        }
    }

}
