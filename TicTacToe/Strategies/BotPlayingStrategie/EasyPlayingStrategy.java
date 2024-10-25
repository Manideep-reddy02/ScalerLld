package TicTacToe.Strategies.BotPlayingStrategie;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.CellState;
import TicTacToe.Models.Move;

import java.util.List;

public class EasyPlayingStrategy implements BotStrategies{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row: board.getBoard()){
            for(Cell cell:row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell,null);
                }
            }
        }return null;
    }
}
