import java.util.Scanner;

// https://jo-el.es/problem/capicua

public class CapICua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] capicuaText = input.nextLine().split("");

        if (checkCapiCua(capicuaText))
            System.out.println("SI");
        else
            System.out.println("NO");
    }

    private static boolean checkCapiCua(String[] capicuaText) {
        for (int i = 0; i < capicuaText.length / 2; i++) {
            if (!capicuaText[i].equals(capicuaText[capicuaText.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }
}