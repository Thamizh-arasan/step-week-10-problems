import java.util.Scanner;

public class BusiestBusRow {
    static void busiestRow(int[][] grid) {
        int bestRow = 0;
        int bestTotal = -1;

        for (int i = 0; i < grid.length; i++) {
            int total = 0;
            for (int j = 0; j < grid[i].length; j++)
                total += grid[i][j];

            if (total > bestTotal) {
                bestTotal = total;
                bestRow = i;
            }
        }

        System.out.println("Row " + bestRow + ", Total " + bestTotal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] grid = new int[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                grid[i][j] = sc.nextInt();

        busiestRow(grid);
    }
}

// Time: O(r * c), Extra space: O(1) beyond the input grid.