public class AIPlayer extends Player{
  
  public AIPlayer(){
    
  }
  
  public int[] generateShipLocation(){
    //use random to pick ships
    int row = (int)(Math.random() * 5);
    int col = (int)(Math.random() * 5);
    
    int[] shipLocation = new int[2];
    
    shipLocation[0] = row;
    shipLocation[1] = col;
    
    return shipLocation;
    
  }
  
  public int[] generateAttack(){
    //use random to pick coordinates to attack
    int row = (int)(Math.random() * 5);
    int col = (int)(Math.random() * 5);
    
    int[] shipLocation = new int[2];
    
    shipLocation[0] = row;
    shipLocation[1] = col;
    
    return shipLocation;
    
  }
  

}