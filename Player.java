public class Player {
  //properties
  private String shipsAlive;
  private String shipsSunk;
  private boolean winning; 

  //constructor
 
public Player(){
  
  shipsAlive = '4';
  shipsSunk = '0';
  winning = '';
  
}
  
   public String getshipsAlive(){
    return shipsAlive;
   }
   public String getshipsSunk(){
    return shipsSunk;
   }
   public boolean getwinning(){
    return winning;
   }
  //getters and setters
  public void setshipsAlive(String newShipsAlive){
shipsAlive = newShipsAlive;
}
  public void setshipsSunk(String newShipsSunk){
shipsSunk = newShipsSunk;
    
    public void setwinning(boolean newWinning){
winning = newWinning;
}
  
  //toString - describes the object for output

     public String toString(){
    return shipsAlive + " " + shipsSunk + " " + winning;
     
  }
}
  

}