import java.util.*;

public class EscalaReial {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int N = input.nextInt();
        ArrayList<Integer> cardDeck = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++)
                cardDeck.add(input.nextInt());

            Collections.sort(cardDeck);
            checkDeck(cardDeck);

            cardDeck.clear();
        }
    }

    private static void checkDeck(ArrayList<Integer> cardDeck) {
        int counter = 1;

        if (cardDeck.containsAll(Arrays.asList(10, 11, 12, 13, 1))) {
            System.out.println("ESCALA REIAL");
            return;
        }

        for (int i = 1; i < cardDeck.size(); i++) {
            if (cardDeck.get(i) != cardDeck.get(i - 1)) {
                if (cardDeck.get(i) == cardDeck.get(i - 1) + 1)
                        counter++;
                else
                    counter = 1;
            } if (counter >= 5) {
                System.out.println("ESCALA");
                return;
            }
        }
        System.out.println("NO");
    }
}