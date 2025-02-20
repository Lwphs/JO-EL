import java.util.Scanner;

public class Atakhan {
    static Scanner input = new Scanner(System.in);
    static String[] text = new String[3];
    static int totalDamage = 0;
    static int counterTop = 0;
    static int counterBot = 0;
    final static int MAX_DMG = 10000;

    public static void main(String[] args) {

        do {
            text = input.nextLine().split(" ");
            int minutes = Integer.parseInt(text[0]);
            int damage = Integer.parseInt(text[2]);

            if (minutes <= 14)
                totalDamage += damage;

            if (!text[0].equals("20")) {
                if (text[1].equals("Bot"))
                    counterBot ++;
                else if (text[1].equals("Top"))
                    counterTop ++;
            }
        } while (!text[0].equals("20"));

        System.out.print("Tot el mon a " );
        if (counterBot > counterTop)
            System.out.print("Bot");
        else
            System.out.print("Top");
        System.out.print(" que ha sortit Atakhan ");
        if (totalDamage >= MAX_DMG)
            System.out.print("Vermell.");
        else
            System.out.print("Negre.");
    }
}
