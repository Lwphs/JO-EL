import java.util.Scanner;

public class cinePol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int filmDuration = input.nextInt();
        int accetableDelay = input.nextInt();
        int hours = input.nextInt();
        int minutes = input.nextInt();

        hours = hoursToMinutes(hours);

        int sum = hours + minutes;

        if (sum % filmDuration <= accetableDelay)
            System.out.println("VEURE");
        else
            System.out.println("MARXAR");
    }

    private static int hoursToMinutes(int hours) {
        return hours * 60;
    }
}
