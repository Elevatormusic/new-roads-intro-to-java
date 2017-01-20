

public class Ship {

  private String shipType;
  private int x;
  private int y; 
  private boolean sunk; 
  
  
  public Ship(){
      shipType = "";
      x = 0;
      y = 0;
      sunk = false; 


  }  
  
  public Ship(String sType, int x, int y, boolean sunk) {
     this.shipType = sType;
     this.x = x;
     this.y = x;
     this.sunk = sunk;
  }
  
  public int getX(){
      return this.x;
  }
  
  public int getY(){
    return this.y;
  }
  
  
 public void setX(int x){
  this.x = x;
 }
  
  public void setY(int x){
    this.y = y;
  }
  
  public void setShipType(String type){
    this.shipType = type;
  }
  
  public String toString(){
    return this.shipType + "is located at  " + this.x + ", " + this.y;
  } 
 
}