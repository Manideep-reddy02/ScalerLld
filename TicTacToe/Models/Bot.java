package TicTacToe.Models;

import TicTacToe.Strategies.BotPlayingStrategie.BotPlayingStrategyFactory;
import TicTacToe.Strategies.BotPlayingStrategie.BotStrategies;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotStrategies botStrategies;
    public Bot(Symbol symbol,String name,Long id,BotDifficultyLevel botDifficultyLevel){
        super(symbol,name,id,PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botStrategies = BotPlayingStrategyFactory.getBotPlayingStrategyFromFactory(botDifficultyLevel);

    }
    @Override
    public Move makeMove(Board board){
       Move move = this.botStrategies.makeMove(board);
       move.setPlayer(this);
       return move;
    }
}
