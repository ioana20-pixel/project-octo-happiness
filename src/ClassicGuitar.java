import java.util.Scanner;

public class ClassicGuitar {
    public static String level;
    String choice;
    String ca = "LAG Classic HyVibe 30 4/4";
    String cb= "Epiphone PRO-1 4/4";
    String ci = "Ortega R131SN 4/4";
    public ClassicGuitar(String choice){
        this.choice = choice;
    }


    public String toString(String choice, String level) {
        return
                "Suggestion for " + choice + " guitar:" + level;
    }

    public void classic_guitar_level(){

        System.out.println("What level are you?");
        System.out.println("Beginner, intermediate or advanced?");

        Scanner scan = new Scanner(System.in);

        level = scan.nextLine();


        switch (level){
            case "advanced":
                System.out.println(toString(choice,ca));
                break;
            case "intermediate":
                System.out.println(toString(choice,ci));
                break;
            case "begginer":
                System.out.println(toString(choice,cb));
            default:
                System.out.println("descurca-te");
        }
    }
}