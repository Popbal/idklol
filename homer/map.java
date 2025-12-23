
public class map {
    private boolean[][] grid;

    private int row = 0;
    private int column = 0;

    public map(int randomizerNumber) {
        boolean[][] everything = new boolean[99][99];
        int source_row = 49;
        int source_column = 49;
        int minRow = source_row, maxRow = source_row;
        int minCol = source_column, maxCol = source_column;
        everything[source_row][source_column] = true;

        while (row < 4 || column < 4) {
            for (int i = 0; i <= randomizerNumber; i++) {
                switch (rng.randomcislo(4)) {
                    case 1:
                        source_column++;
                        break;
                    case 2:
                        source_column--;
                        break;
                    case 3:
                        source_row--;
                        break;
                    case 4:
                        source_row++;
                        break;
                }
                everything[source_row][source_column] = true;

                minRow = Math.min(minRow, source_row);
                maxRow = Math.max(maxRow, source_row);
                minCol = Math.min(minCol, source_column);
                maxCol = Math.max(maxCol, source_column);
            }
            this.row = maxRow - minRow + 1;
            this.column = maxCol - minCol + 1;
        }

        this.grid = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                grid[i][j] = everything[minRow + i][minCol + j];
                ;
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    System.out.print("[] ");
                } else {
                    System.out.print(".. ");
                }
            }
            System.out.println();
        }
    }
}