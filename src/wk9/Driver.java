package wk9;

public class Driver {
    public static void main(String[] args) {
        int[][] grid = new int[2][5];
        System.out.println(grid.length);
        System.out.println(grid[0].length);
        // 2 5 9 12 17
        // 3 8 0  0  0
        grid[0][0] = 2;
        grid[0][1] = 5;
        grid[0][2] = 9;
        grid[0][3] = 12;
        grid[0][4] = 17;
        grid[1][0] = 3;
        grid[1][1] = 8;
        grid[1][2] = 0;
        grid[1][3] = 0;
        grid[1][4] = 0;
        printEven(grid);
//        printDiagonalValues(grid);
    }

    private static void printEven(int[][] grid) {
        for (int row = 0; row < grid.length; ++row) {
            for (int col = 0; col < grid[0].length; ++col) {
                if (grid[row][col] % 2 == 0) {
                    System.out.println(grid[row][col]);
                }
            }
        }
    }

    private static void printDiagonalValues(int[][] grid) {
        for (int i = 0; i < grid.length; ++i) {
            System.out.println(grid[i][i]);
        }
    }

    public static void main2(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(nums.length);
        nums = addOne(nums, 9);
        nums = addOne(nums, 8);
        System.out.println(nums.length);
    }

    private static int[] addOne(int[] nums, int newGuy) {
        int[] bigger = new int[nums.length + 1];
        bigger[nums.length] = newGuy;
        System.arraycopy(nums, 0, bigger, 0, nums.length);
        return bigger;
    }
}
