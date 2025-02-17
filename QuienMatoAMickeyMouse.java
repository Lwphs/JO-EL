import java.util.Scanner;

public class QuienMatoAMickeyMouse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nCasos = input.nextInt();
        for (int i= 0; i<nCasos; i++) {
            int deadge = 0;
            int potsVeri = input.nextInt();
            while (potsVeri != 1) {
                if (potsVeri % 2 == 1) {
                    potsVeri++;
                }
                potsVeri /= 2;
                deadge++;
            }
            System.out.println(deadge);
        }
    }
}