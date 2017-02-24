import java.util.Scanner;

public class TestBattleShip{

  public static void main(String[] args){
    
    /*
      Player player1 = new Player();
      player1.setwinning(true);
    
      System.out.println(player1);
    
      Ship ship1 = new Ship("2-unit", 3, 4, false);
      System.out.println(ship1);
    
      BattleShipBoard board = new BattleShipBoard();
      board.printBoard();
      System.out.println("Updated board...");
      board.setupShips(1, 1);
      board.printBoard();
    
      //have objects interact
      System.out.println("Setting up ships with their chosen...");
      board.setupShips(ship1.getX(), ship1.getY());
      board.printBoard();
    
    */
    
    //set up variables
    Player human;
    AIPlayer ai = new AIPlayer();
    int row = 0;
    int col = 0;
    int[] aiShips = new int[2];
    BattleShipBoard userBoard = new BattleShipBoard();
    BattleShipBoard guessBoard = new BattleShipBoard();
    BattleShipBoard aiBoard = new BattleShipBoard();
    
    //set up scanner for user input
    Scanner input = new Scanner(System.in);
    
    //Output directions/intro to the console
    System.out.println("");
    System.out.println("" +                       
  "\n ____        _   _   _      ____  _     _   " +    
 "\n | __ )  __ _| |_| |_| | ___/ ___|| |__ (_)_ __  " + 
 |  _ \ / _` | __| __| |/ _ \___ \| '_ \| | '_ \ 
 | |_) | (_| | |_| |_| |  __/___) | | | | | |_) |
 |____/ \__,_|\__|\__|_|\___|____/|_| |_|_| .__/ 
                                          |_|    
                                                                             

                                     |__
                                     |\/
                                     ---
                                     / | [
                              !      | |||
                            _/|     _/|-++'
                        +  +--|    |--|--|_ |-
                     { /|__|  |/\__|  |--- |||__/
                    +---------------___[}-_===_.'____                 /\
                ____`-' ||___-{]_| _[}-  |     |_[___\==--            \/   _
 __..._____--==/___]_|__|_____________________________[___\==--____,------' .7
|                                                                     BB-61/
 \_________________________________________________________________________|");
    System.out.println("What's your name?");
    human = new Player(input.next());
    System.out.println("Hi " + human.getName() + "!");
    
    //set up user ships
    System.out.println("You get 1 ship, choose it's location...");
    System.out.println("Enter in horizontal location (1-5):");
    row = input.nextInt();
    System.out.println("Enter in vertical location (1-5)");
    col = input.nextInt();
    userBoard.setupShips(row, col);
    System.out.println("Your current board...");
    userBoard.printBoard();
    
    //set up AI ships
    aiShips = ai.generateShipLocation();
    aiBoard.setupShips(aiShips[0], aiShips[1]);
    System.out.println("------------------------");
    aiBoard.printBoard(); //testing
    
    //user attacks 
    System.out.println("Now choose the location for your attack");
    System.out.println("Enter in x location");
    row = input.nextInt();
    System.out.println("Enter in y location");
    col = input.nextInt();
    
    if(aiBoard.getBoard()[row][col] == '#'){
      System.out.println("Ship sunk!");
    }
    else{
      System.out.println("Missed!");
      System.out.println("You are off by " + Math.abs(aiShips[0] - row) + " row and " + Math.abs(aiShips[1] - col) + " columns."); 
      guessBoard.getBoard()[row][col] = 'M';
    }
    
    /*
    System.out.println("The attack was ... . The enemy ship has ... many spaces left");
    System.out.println("Your ship was hit on x,y location!");
    System.out.println("Pick a new location for your attack");
    System.out.println("The attack was ... . The enemy ship has sunk");
    System.out.println("You've ...")
    */
            
  }

}