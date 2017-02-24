public class BattleShipBoard{

  private char[][] board = {
                              {' ', ' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' ', ' '},
                           };
  
  public BattleShipBoard(){
    //board is initialized  
  }
  
  public char[][] getBoard(){
    return board;
  }
  
  public void setupShips(int x, int y){
    board[x][y] = '#'; 
  }
  
  public void printBoard(){
    System.out.println("   " + board[0][0] + " 1 " + board[0][1] + " 2 " + board[0][2] + " 3 " + board[0][3] + " 4 " + board[0][4]  + " 5 ");
    System.out.println("   1 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " | " + board[1][4]  + " | ");
    System.out.println("   2 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " | " + board[2][4]  + " | ");
    System.out.println("   3 " + board[3][0] + " | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " | " + board[3][4]  + " | ");
    System.out.println("   4 " + board[4][0] + " | " + board[4][1] + " | " + board[4][2] + " | " + board[4][3] + " | " + board[4][4]  + " | ");
    System.out.println("   5 " + board[5][0] + " | " + board[5][1] + " | " + board[5][2] + " | " + board[5][3] + " | " + board[5][4]  + " | ");
    }
  } 