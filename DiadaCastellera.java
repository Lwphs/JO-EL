import java.util.HashMap;
import java.util.Scanner;

public class DiadaCastellera {
    private static final Scanner input = new Scanner(System.in);
    static int boomersA = 0;
    static int boomersB = 0;
    static int milenialsA = 0;
    static int milenialsB = 0;
    static int[] arrayColla = new int[8];
    static boolean error = false;

    public static void main(String[] args) {
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < arrayColla.length; j++) {
                arrayColla[j] = input.nextInt();
                if (j % 2 == 1 && arrayColla[j] > arrayColla[j - 1]) {
                    error = true;
                    break;
                } else if (j % 2 == 1 && arrayColla[j] <= arrayColla[j - 1])
                     checkWhoGetsPoints(j);
            }
        }

        if (error)
            System.out.println("ERROR");
        else
            checkWhoWon();

        input.close();
    }

    private static void checkWhoWon() {
        int totalA = milenialsA + boomersA;
        int totalB = milenialsB + boomersB;
        int totalMilenials = milenialsA + milenialsB;
        int totalBoomers = boomersA + boomersB;

        if (totalA > totalB)
            System.out.println("A");
        else
            System.out.println("B");

        if (totalBoomers > totalMilenials)
            System.out.println("BOOMERS");
        else
            System.out.println("MILENIALS");
    }

    private static void checkWhoGetsPoints(int j) {
        if (j == 1)
            boomersA += arrayColla[j];
        if (j == 3)
            milenialsA += arrayColla[j];
        if (j == 5)
            boomersB += arrayColla[j];
        if (j == 7)
            milenialsB += arrayColla[j];
    }
}
