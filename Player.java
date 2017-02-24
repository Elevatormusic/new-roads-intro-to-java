/**
 TO-DO: camelcase your methods
*/
public class Player {
  //properties
  private int shipsAlive;
  private int shipsSunk;
  private boolean winning; 
  private String name;

  //constructor
 
  public Player(){

    shipsAlive = 4;
    shipsSunk = 0;
    winning = false;
  }
  
  public Player(String newName){
    name = newName; 
    shipsAlive = 4;
    shipsSunk = 0;
    winning = false;
  }
  
  public String getName(){
    return name;
  }
  
  public void setName(String newName){
    
    this.name = newName;
  }
  
   public int getshipsAlive(){
    return shipsAlive;
   }
  
   public int getshipsSunk(){
    return shipsSunk;
   }
  
   public boolean getwinning(){
    return winning;
   }
  
  //getters and setters
  public void setshipsAlive(int newShipsAlive){
    shipsAlive = newShipsAlive;
  }
  
  public void setshipsSunk(int newShipsSunk){
    shipsSunk = newShipsSunk;
  }
  
  public void setwinning(boolean newWinning){
    winning = newWinning;
  }
  
  //toString - describes the object for output

  public String toString(){
    return name + " " + shipsAlive + " " + shipsSunk + " " + winning;
  }

}