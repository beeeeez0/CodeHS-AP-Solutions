public class TicTacToe
{
    private String[][] board = new String[3][3];

    public TicTacToe() {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                board[r][c] = "-";
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }

}