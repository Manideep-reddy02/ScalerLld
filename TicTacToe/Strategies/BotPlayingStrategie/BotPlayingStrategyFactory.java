package TicTacToe.Strategies.BotPlayingStrategie;

import TicTacToe.Models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotStrategies getBotPlayingStrategyFromFactory(BotDifficultyLevel botDifficultyLevel){
        return new EasyPlayingStrategy();
    }
}
