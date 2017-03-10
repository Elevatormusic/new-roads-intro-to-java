import java.util.Scanner;

public class Gameplay{
  
  public Gameplay(){
    //empty for now
  }
  
  public boolean playerMove(BattleShipBoard board, Scanner input){
    System.out.println("Now choose the location for your attack");
    new Delayer().delay();
    System.out.println("Enter in horizontal location (1-5)");
    int row = input.nextInt();
    new Delayer().delay();
    System.out.println("Enter in vertical location (1-5)");
    int col = input.nextInt();
    new Delayer().delay();
    
    if(board.getBoard()[row][col] == '#'){
      System.out.println("Ship sunk!");
      new Delayer().delay();
       return true;
      }
    
    return false;
   
    } 
    
  }
