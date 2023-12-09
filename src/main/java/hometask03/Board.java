package hometask03;

public class Board {


    private String[][] gameBoard;

    private int rowNumber;
    private int columnNumber;
    public int getRowNumber() {
        return rowNumber;
    }
    public int getColumnNumber() {
        return columnNumber;
    }
    public String[][] getGameBoard() {
        return gameBoard;
    }
    public Board(int rowNum, int columnNum) {
        rowNumber = rowNum;
        columnNumber = columnNum;
        gameBoard = new String[rowNumber][columnNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                gameBoard[i][j] = "";
            }
        }
    }

    public void printGameBoard() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(gameBoard[i][j]);
                if (gameBoard[i][j] == "")
                System.out.print(" _");
            }
            System.out.println();
        }
    }

    public void updateGameBoard (String symbol, int row, int column) {
        gameBoard[row][column] = symbol;

    }
}

