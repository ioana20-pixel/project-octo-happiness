import java.util.Scanner;

public class Bass {
    public static String level;
    public static String name = "Bass guitar";

    private void guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();

        switch (level){
            case "Advanced":
                System.out.println("Suggestion: Fender Squier Classic Vibe 70s");
                break;
            case "Intermediate":
                System.out.println("Suggestion: Ibanez GSRM20L-BK");
                break;
            case "Begginer":
                System.out.println("Suggestion: Pasadena STB-150");

            default:
                System.out.println("descurca-te");
        }
    }
}