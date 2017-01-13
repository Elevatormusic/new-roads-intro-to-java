public class TestCard{

  public static void main(String[] args){

    Card c1 = new Card(); 
    Card c2 = new Card(); 
    Card c3 = new Card();

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    c1.setRank("J"); 
    c1.setColor("Red");
    c1.setSuit("Spades");
    
    c2.setRank("K");
    c2.setColor("black");
    c2.setSuit("Diamond");
    
    c3.setRank("Q"); 
    c3.setColor("Red");
    c3.setSuit("Heart");
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    }
}