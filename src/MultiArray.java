public class MultiArray {

    public static void main(String[] args){

        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(grid[1][0]);
        System.out.println(grid[1][1]);

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++){
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }
    }
}
