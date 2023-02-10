public class Card{
  private char suit;
  private char value;
  public static char[]  suits = {'C', 'D', 'H', 'S'};
  public static char[] values = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};

  public Card(int suit, int value){
    this.suit = suits[suit];
    this.value = values[value];
  }

  public int getPoints(){
    int points = 0;
    if(Character.getNumericValue(value) >= 0 || Character.getNumericValue(value) <= 7){
      points = Character.getNumericValue(value);
    }
    else if(value != 'A'){
      points = 10;
    }
    else{
      points = 1;
    }
    return points;
  }

  public String toString(){
    return "" + suit + value;
  }

  
  
}