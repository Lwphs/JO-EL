import java.util.Scanner;

public class Bomberman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] bombermanMatrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                bombermanMatrix[i][j] = input.nextInt();
        }

        int xPos = input.nextInt();
        int yPos = input.nextInt();

        int sumX = 0;
        int sumY = 0;

        for (int i = 0; i < column; i++) {
            sumX += bombermanMatrix[xPos][i];
        }

        for (int i = 0; i < row; i++) {
            if (i != xPos)
                sumY += bombermanMatrix[i][yPos];
        }

        System.out.println(sumX + sumY);
    }
}