package TicTacToe.Strategies.PalyerWinningStrategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface WinningStrategies {
    boolean checkWinner(Board board, Move move);
}
