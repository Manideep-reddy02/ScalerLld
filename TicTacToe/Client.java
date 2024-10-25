package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.*;
import TicTacToe.Strategies.PalyerWinningStrategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController= new GameController();
        try{
            int dimension = 3;
            List<Player> playerList = new ArrayList<>();
            playerList.add(new Player(new Symbol('X'),"Manideep",1l, PlayerType.HUMAN));
            playerList.add(new Bot(new Symbol('O'),"Bot",2l,BotDifficultyLevel.EASY));
            List<WinningStrategies> winningStrategies = new ArrayList<>();
            Game game = gameController.startGame(dimension,playerList,winningStrategies);

            while (gameController.checkState(game).equals(GameState.INPROGRESS)) {
                gameController.printBoard(game);
                gameController.makeMove(game);
            }
        }
        catch (Exception ex){
            System.out.println("there was an excpetion creating the game");
        }
        System.out.println("Game is created ");

    }
}
