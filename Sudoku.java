import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] matrix = new int[9][9];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {

                for (int k = 0; k < 9; k++)
                    matrix[j][k] = input.nextInt();

            }
            boolean checkingRows = searchRows(matrix);
            boolean checkingColumns = searchColumns(matrix);

            if (checkingRows && checkingColumns)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

    private static boolean searchRows(int[][] matrix) {
        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j != i)
                        if (matrix[k][j] == matrix[k][i])
                            return false;
                }
            }
        }
        return true;
    }

    private static boolean searchColumns(int[][] matrix) {
        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j != i)
                        if (matrix[j][k] == matrix[i][k])
                            return false;
                }
            }
        }
        return true;
    }
}

