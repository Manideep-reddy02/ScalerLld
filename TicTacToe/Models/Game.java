package TicTacToe.Models;

import TicTacToe.Exceptions.MoreThanOneBotException;
import TicTacToe.Exceptions.PlayerCountMissMatch;
import TicTacToe.Exceptions.PlayerSymbolAlreadyExsits;
import TicTacToe.Strategies.PalyerWinningStrategies.WinningStrategies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private List<Player> players;
    private int Id;
    private List<Move> moves;
    private List<WinningStrategies> winningStrategies;

    private GameState gameState;
    private int nextMovePlayerID;
    private Player winner;
    private Board board;
    private Game(int dimension,List<Player>players,List<WinningStrategies>winningStrategies){
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.gameState = GameState.INPROGRESS;
        this.nextMovePlayerID =0;
    }
 public void printBoard(){
        this.board.print();
 }

 public void makeMove(){
        Player currentMovePlayer = this.players.get(nextMovePlayerID);
     System.out.println("This is "+ currentMovePlayer.getName()+" s turn");
    Move playerMove =  currentMovePlayer.makeMove(board);
    if(!validateMove(playerMove)){
        System.out.println("your move is not valid");
        return;
    }
    int row = playerMove.getCell().getRow();
    int col = playerMove.getCell().getCol();
    Cell boarCell = this.board.getBoard().get(row).get(col);
    boarCell.setCellState(CellState.FILLED);
    boarCell.setPlayer(currentMovePlayer);

    Move finalMoveObj = new Move(boarCell,currentMovePlayer);
    moves.add(finalMoveObj);
    nextMovePlayerID++;
    nextMovePlayerID%=players.size();

    //Check we have a winner or not
     if(checkWinner(finalMoveObj)){
         gameState = GameState.WIN;
         this.winner = currentMovePlayer;
     }else if(this.moves.size()==this.board.getSize()*this.board.getSize()){
         gameState = GameState.DRAW;
     }


 }
 private boolean checkWinner(Move move){
        for(WinningStrategies winningStrategies1:this.winningStrategies){
            if(winningStrategies1.checkWinner(board,move)){
                return true;
            }

        }return false;
 }

    private boolean validateMove(Move playerMove) {
        int row = playerMove.getCell().getRow();
        int col = playerMove.getCell().getCol();
        if(row>=board.getSize()||col>=board.getSize()){
            return false;
        }
        if(board.getBoard().get(row).get(col).getCellState().equals(CellState.FILLED)){
            return false;
        }
        return true;
    }

    public static Builder getBuilder(){
        return new Builder();
}
//for validation we use builder design pattern
    public static class Builder{
        private List<Player> players;

        private List<WinningStrategies> winningStrategies;

        private int boardDimension;
        private Builder(){
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.boardDimension =0;
        }

    public Builder setPlayers(List<Player> players) {
        this.players = players;
        return this;
    }


    public Builder setWinningStrategies(List<WinningStrategies> winningStrategies) {
        this.winningStrategies = winningStrategies;
        return this;
    }

    public Builder setBoardDimension(int boardDimension) {
        this.boardDimension = boardDimension;
        return this;
    }
    private void BotCountValidate() throws Exception{
        //validate bout count
        int botCount =0;
        for(Player player:this.players){
            if(player.getPlayerType().equals(PlayerType.BOT)){
                botCount++;
            }
        }
        if(botCount>1){
            throw  new MoreThanOneBotException();
        }

    }
    private void playerCountValidate()throws Exception{
        //validate player count
        if(players.size()!=boardDimension-1){
            throw new PlayerCountMissMatch();
        }

    }
    private void symbolValidate() throws Exception{
        //validate uniQue player symbol
        HashSet<Character> uniqueSymbol= new HashSet<>();
        for (Player player:this.players){
            if(uniqueSymbol.contains(player.getSymbol().getaChar())){
                throw new PlayerSymbolAlreadyExsits();
            }
        }

    }

    private void Validate() throws Exception{
            BotCountValidate();
            playerCountValidate();
            symbolValidate();
    }
    public Game Build() throws Exception{
            Validate();
            return new Game(boardDimension,players,winningStrategies);
    }
}
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategies> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategies> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextMovePlayerID() {
        return nextMovePlayerID;
    }

    public void setNextMovePlayerID(int nextMovePlayerID) {
        this.nextMovePlayerID = nextMovePlayerID;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
