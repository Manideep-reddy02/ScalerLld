package TicTacToe.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board (int size){
        this.size =size;
        this.board = new ArrayList<>();
        for(int i=0;i<size;i++){
            //inside the big arrayList it will create small arrayList
            board.add(new ArrayList<>());
            for(int j=0;j<size;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }
    public void print(){
        for(List<Cell> rows:board){
            for (Cell cell:rows){
                cell.print();
            }
            System.out.println();
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }






}
