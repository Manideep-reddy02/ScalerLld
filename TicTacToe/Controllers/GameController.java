package TicTacToe.Controllers;

import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;
import TicTacToe.Models.Player;
import TicTacToe.Strategies.PalyerWinningStrategies.WinningStrategies;

import java.util.List;

public class GameController {

    //client will talk to only this class
    public Game startGame(int dimensionBoard, List<Player> players, List<WinningStrategies> winningStrategies)throws Exception{
            return Game.getBuilder()
                    .setBoardDimension(dimensionBoard)
                    .setPlayers(players)
                    .setWinningStrategies(winningStrategies)
                    .Build();
    }

    public void makeMove(Game game){
        game.makeMove();

    }
    public void printBoard(Game game){
        game.printBoard();

    }
    public GameState checkState(Game game){
        return game.getGameState();

    }
    public void getWinner(Game game){

    }

}
