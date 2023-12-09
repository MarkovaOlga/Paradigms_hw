package hometask03;

import java.util.Scanner;

public class Game {
    private Board gameBoard;

    public void startTicTacToeGame() {
        gameBoard = new Board(3, 3);
        Scanner scanner = new Scanner(System.in);
        String currentPlayer = " X";

        while (true) {
            System.out.println("Ход игрока " + currentPlayer);

            gameBoard.printGameBoard();
            int row = -1;
            int column = -1;

            while (!isMoveAllowed(row, column, gameBoard)) {
                System.out.print("Укажите номер строки от 1 до 3: ");
                row = scanner.nextInt() - 1;
                System.out.print("Укажите номер столбца от 1 до 3: ");
                column = scanner.nextInt() - 1;
                if (!isMoveAllowed(row, column, gameBoard)) {
                    System.out.println("Поле занято либо вы указали неверный номер");
                }

            }
            gameBoard.updateGameBoard(currentPlayer, row, column);

            if (checkWinner(gameBoard)) {
                System.out.println("Игрок " + currentPlayer + " одеждал победу!!!");
                gameBoard.printGameBoard();
                break;
            } else if (isDrawnGame(gameBoard)) {
                System.out.println("Ничья!");
                gameBoard.printGameBoard();
                break;
            }
            currentPlayer = (currentPlayer == " X") ? " O" : " X";
        }
    }

    private boolean isMoveAllowed(int row, int column, Board gameBoard) {
        if (row < 0 || column < 0 || row >= gameBoard.getRowNumber() || column >= gameBoard.getColumnNumber()) {
            return false;
        }
        if (gameBoard.getGameBoard()[row][column] != "") {
            return false;
        }
        return true;
    }

    private boolean checkWinner(Board gameBoard) {
        for (int i = 0; i < gameBoard.getRowNumber(); i++) {
            if (gameBoard.getGameBoard()[i][0] == gameBoard.getGameBoard()[i][1] && gameBoard.getGameBoard()[i][1] == gameBoard.getGameBoard()[i][2] && gameBoard.getGameBoard()[i][0] != "") {
                return true;
            }
            if (gameBoard.getGameBoard()[0][i] == gameBoard.getGameBoard()[1][i] && gameBoard.getGameBoard()[1][i] == gameBoard.getGameBoard()[2][i] && gameBoard.getGameBoard()[0][i] != "") {
                return true;
            }
            if (gameBoard.getGameBoard()[0][0] == gameBoard.getGameBoard()[1][1] && gameBoard.getGameBoard()[1][1] == gameBoard.getGameBoard()[2][2] && gameBoard.getGameBoard()[0][0] != "") {
                return true;
            }
            if (gameBoard.getGameBoard()[0][2] == gameBoard.getGameBoard()[1][1] && gameBoard.getGameBoard()[1][1] == gameBoard.getGameBoard()[2][0] && gameBoard.getGameBoard()[0][2] != "") {
                return true;
            }
        }
        return false;
    }

    private boolean isDrawnGame (Board gameBoard) {
        for (int i = 0; i < gameBoard.getRowNumber(); i++) {
            for (int j = 0; j < gameBoard.getColumnNumber(); j++) {
                if (gameBoard.getGameBoard()[i][j] == "") {
                    return false;
                }
            }
        }
        return true;
    }

}

