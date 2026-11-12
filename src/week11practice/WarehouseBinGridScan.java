package week11practice;

public class WarehouseBinGridScan {

    public record Summary(int total, int row, int col) {
    }

    public static Summary warehouseSummary(int[][] grid) {
        long total = 0;
        int maxRow = 0;
        int maxCol = 0;
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                int value = grid[row][col];
                total += value;
                if (value > max) {
                    max = value;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        return new Summary((int) total, maxRow, maxCol);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {4, 9, 2},
                {7, 1, 6},
                {3, 12, 5}
        };
        Summary summary = warehouseSummary(grid);
        System.out.println("total = " + summary.total() + ", maxCoordinate = (" + summary.row() + ", " + summary.col() + ")");
    }
}
