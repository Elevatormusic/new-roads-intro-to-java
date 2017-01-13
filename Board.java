public class Board{

  private char[] row1 = {' ',' ',' ',' ',' '};
  private char[] row2 = {' ',' ',' ',' ',' '};
  private char[] row3 = {' ',' ',' ',' ',' '};
  private char[] row4 = {' ',' ',' ',' ',' '};
  private char[] row5 = {' ',' ',' ',' ',' '};
  
  public Board(){
    
  }
  
  public void printBoard(){
    System.out.println(" " + row1[0] + " | " + row1[1] + " | " + row1[2] + " | " + row1[3] + " | " + row1[4] + " ");
    System.out.println(" " + row2[0] + " | " + row2[1] + " | " + row2[2] + " | " + row2[3] + " | " + row2[4] + " ");
    System.out.println(" " + row3[0] + " | " + row3[1] + " | " + row3[2] + " | " + row3[3] + " | " + row3[4] + " ");
    System.out.println(" " + row4[0] + " | " + row4[1] + " | " + row4[2] + " | " + row4[3] + " | " + row4[4] + " ");
    System.out.println(" " + row5[0] + " | " + row5[1] + " | " + row5[2] + " | " + row5[3] + " | " + row5[4] + " ");
  
   }
}