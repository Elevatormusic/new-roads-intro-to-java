public class Card{

String rank;
String color;
String suit;

  public Card(){
rank = "A";
color = "Black";
suit = "Club";
    
}
  
  //getters
  public String getRank(){
    return rank;
  }
  public String getColor(){
return color;
  } 
  public String getSuit(){
    return suit;
}
  
  
  
//setters
  public void setRank(String newRank){
rank = newRank;
}
  public void setColor(String newColor){
color = newColor;
}
  public void setSuit(String newSuit){
suit = newSuit;
}
  
  //prints details about object
  public String toString(){
    return rank + " " + color + " " + suit;
     
  }
}