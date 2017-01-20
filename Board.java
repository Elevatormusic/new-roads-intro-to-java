public class Board{

  private char[] row0 = {' ',' ',' ',' ',' '};
  private char[] row1 = {' ',' ',' ',' ',' '};
  private char[] inv1 = {' ',' ',' ',' ',' '};
  private char[] row2 = {' ',' ',' ',' ',' '};
  private char[] inv2 = {' ',' ',' ',' ',' '};
  private char[] row3 = {' ',' ',' ',' ',' '};
  private char[] inv3 = {' ',' ',' ',' ',' '};
  private char[] row4 = {' ',' ',' ',' ',' '};
  private char[] inv4 = {' ',' ',' ',' ',' '};
  private char[] row5 = {' ',' ',' ',' ',' '};
  private char[] inv5 = {' ',' ',' ',' ',' '};
  
 
  public Board(){
    
  }
  
  public void printBoard(){
    System.out.println("   " + row0[0] + " 1 " + row0[1] + " 2 " + row0[2] + " 3 " + row0[3] + " 4 " + row0[4] + " ");
    System.out.println(" 1 " + row1[0] + " ~ " + row1[1] + " ~ " + row1[2] + " ~ " + row1[3] + " ~ " + row1[4] + " ");
    System.out.println(" 2 " + row2[0] + " ~ " + row2[1] + " ~ " + row2[2] + " ~ " + row2[3] + " ~ " + row2[4] + " ");
    System.out.println(" 3 " + row3[0] + " ~ " + row3[1] + " ~ " + row3[2] + " ~ " + row3[3] + " ~ " + row3[4] + " ");
    System.out.println(" 4 " + row4[0] + " ~ " + row4[1] + " ~ " + row4[2] + " ~ " + row4[3] + " ~ " + row4[4] + " ");
    System.out.println(" 5 " + row5[0] + " ~ " + row5[1] + " ~ " + row5[2] + " ~ " + row5[3] + " ~ " + row5[4] + " ");
    
  
   }
}