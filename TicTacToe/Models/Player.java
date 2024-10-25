package TicTacToe.Models;

import java.util.Scanner;

public class Player {
    private String name;
    private long id;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner scanner;
    public Player(Symbol symbol, String name, Long id, PlayerType playerType){
        this.name = name;
        this.playerType = playerType;
        this.id = id;
        this.symbol = symbol;
        this.scanner = new Scanner(System.in);

    }
    public Move makeMove(Board board){
        System.out.println("Please tell row count where you want to move");
        int row = scanner.nextInt();
        System.out.println("please tell col count where you want to move");
        int col = scanner.nextInt();
        return new Move(new Cell(row,col),this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }


}
