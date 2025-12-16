package homer;

public class map {
    String[][] grid;  
    public map(int width, int height) {
        grid = new String[width][height];
    }
    public void createGeneratedMap() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "■";
            }
        }
        grid[0][0] = "□";
    }
}
