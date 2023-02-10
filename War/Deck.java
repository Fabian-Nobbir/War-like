import java.util.*;

public class Deck{

  public ArrayList<Card> cards = new ArrayList<Card>();
  private static Random rand = new Random();

  public Deck(){
    for(int i = 0;i<4;i++){
      for(int j = 0; j<13;j++){
        cards.add(new Card(i,j));
      }
    }
  }

  public void shuffle(){
    ArrayList<Card> shuffled = new ArrayList<Card>();
    for(int i=0;i<52;i++){
      int randIndex = rand.nextInt(53);
      shuffled.add(cards.get(randIndex));
      cards.remove(randIndex);
    }
    cards = shuffled;
  }


  public String toString(){
    String output = "";
    for(int i = 0; i < cards.size();i++){
      output += cards.get(i).toString() + ", ";
    }
    return output;
  }
}