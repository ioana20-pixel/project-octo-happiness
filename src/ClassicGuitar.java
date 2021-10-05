import java.util.Scanner;

public class ClassicGuitar {
    public static String level;
    public static String name = "Classic guitar";

    private void guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();

        switch (level){
            case "Advanced":
                System.out.println("Suggestion: LAG Classic HyVibe 30 4/4");
                break;
            case "Intermediate":
                System.out.println("Suggestion: Ortega R131SN 4/4");
                break;
            case "Begginer":
                System.out.println("Suggestion: Epiphone PRO-1 4/4");

            default:
                System.out.println("descurca-te");
        }
    }
}