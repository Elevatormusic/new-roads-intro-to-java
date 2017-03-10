import java.util.Scanner;

public class TestBattleShip{

  public static void main(String[] args){
    
     while (true){
   
    Player human;
    AIPlayer ai = new AIPlayer();
    String yesOrNo = " "; 
    int row = 0;
    int col = 0;
    int[] aiShips = new int[2];
    BattleShipBoard userBoard = new BattleShipBoard();
    BattleShipBoard guessBoard = new BattleShipBoard();
    BattleShipBoard aiBoard = new BattleShipBoard();
    Gameplay gameplay = new Gameplay();
    
    //set up scanner for user input
    Scanner input = new Scanner(System.in);
    
    
      //Output directions/intro to the console  
      //splashscreen variables
    String str = new String("@@@@@@@@@@@@@@@@____@@@@@@@@_@@@_@@@_@@@@@@@_____@_@@@@@_@@@@@@@\r\n@@@@@@@@@@@@@@@|@@_@\\@@@@@@|@|@|@|@|@|@@@@@/@____|@|@@@(_)@@@@@@\r\n@@@@@@@@@@@@@@@|@|_)@|@__@_|@|_|@|_|@|@___|@(___@|@|__@@_@_@__@@\r\n@@@@@@@@@@@@@@@|@@_@<@/@_`@|@__|@__|@|/@_@\\\\___@\\|@'_@\\|@|@'_@\\@\r\n@@@@@@@@@@@@@@@|@|_)@|@(_|@|@|_|@|_|@|@@__/____)@|@|@|@|@|@|_)@|\r\n@@@@@@@@@@@@@@@|____/@\\__,_|\\__|\\__|_|\\___|_____/|_|@|_|_|@.__/@\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|@|@@@@\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|_|@@@@\r\n                                                                           ");
    String str2 = new String("\r\n\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|__\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|\\/\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@---\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/@|@[\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@|@|||\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@_/|@@@@@_/|-++'\r\n@@@@@@@@@@@@@@@@@@@@@@@@+@@+--|@@@@|--|--|_@|-\r\n@@@@@@@@@@@@@@@@@@@@@{@/|__|@@|/\\__|@@|---@|||__/\r\n@@@@@@@@@@@@@@@@@@@@+---------------___[}-_===_.'____@@@@@@@@@@@@@@@@@/\\\r\n@@@@@@@@@@@@@@@@____`-'@||___-{]_|@_[}-@@|@@@@@|_[___\\==--@@@@@@@@@@@@\\/@@@_\r\n@__..._____--==/___]_|__|_____________________________[___\\==--____,------'@.7\r\n|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@BB-61/\r\n@\\_________________________________________________________________________|");
     //splashscreen render 
      System.out.println("\r\n");
    System.out.println(str.replaceAll("@", " "));  
    System.out.println(str2.replaceAll("@", " "));
    System.out.println("\r\n");
    //game start
    new Delayer().delay();
    System.out.println("What's your name? ");
    human = new Player(input.next());
    new Delayer().delay();
    System.out.println("Hi " + human.getName() + "!");
    
    //set up user ships
    new Delayer().delay();
    System.out.println("You get 1 ship, choose it's location...");
    new Delayer().delay();
    System.out.println("Enter in horizontal location (1-5):");
    row = input.nextInt();
    new Delayer().delay();
    System.out.println("Enter in vertical location (1-5)");
    col = input.nextInt();
    new Delayer().delay();
    userBoard.setupShips(row, col);
    System.out.println("Your current board...");
    new Delayer().delay();
    userBoard.printBoard();
    
    //set up AI ships
    aiShips = ai.generateShipLocation();
    aiBoard.setupShips(aiShips[0], aiShips[1]);
    System.out.println("---------------------------");
    aiBoard.printBoard(); //testing
    
    boolean hit = gameplay.playerMove(aiBoard, input);
    if(hit()){
      
      //add splash screen 
      
      System.out.println("Would you like to restart? yes or no"); 
      yesOrNo = input.next();
      if (yesOrNo.equals("yes")) {
        new Delayer().delay();
        System.out.print("\033[H\033[2J");
      }
     
    else{
      System.out.println("Missed!");
      new Delayer().delay();
      System.out.println("You are off by " + Math.abs(aiShips[0] - row) + " row and " + Math.abs(aiShips[1] - col) + " columns."); 
      guessBoard.getBoard()[row][col] = 'M';
      }
    }
    
      //AI attacks
      new Delayer().delay();
      System.out.println("AI is now attacking...");
      row = (int)(Math.random() *  5 + 1);
      col = (int)(Math.random() *  5 + 1);
      new Delayer().delay();


        if(userBoard.getBoard()[row][col] == '#'){
          System.out.println("AI sunk your ship!");
          new Delayer().delay();
          System.out.println("Would you like to restart? yes or no"); 
          yesOrNo = input.next();
          
          if (yesOrNo.equals("yes")) {
            new Delayer().delay();
            System.out.print("\033[H\033[2J");
            continue;
          }
      }
      else{
        System.out.println("AI missed!");
        guessBoard.getBoard()[row][col] = 'M';
      }
    } //end else
    } //end while loop
  
    
  }       


  
