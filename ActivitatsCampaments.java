import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ActivitatsCampaments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            ArrayList<String> kids = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));

            int cont = 0;
            int nActivitats = input.nextInt();

            for (int j = 0; j < nActivitats; j++) {
                int nensPerActivitat = input.nextInt();
                int endIndex = Math.min(cont + nensPerActivitat, kids.size());
                System.out.println("Activitat " + (j+1) + ": " +
                        Arrays.toString(kids.subList(cont, endIndex).toArray()));

                cont += nensPerActivitat;
            }

            if (cont < kids.size()) {
                for (int j = 0; j < kids.size() - cont; j++)
                    System.out.println("Nens sobrants: " + kids.subList(cont, kids.size()).get(j));
            } else
                System.out.println("Tots els nens han estat assignats.");

            input.nextLine();
        }
    }
}
