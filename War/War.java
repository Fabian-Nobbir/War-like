import java.util.*;

public class War{

  private static Random rand = new Random();
  private static String winner = "";
  private  boolean playAgain = true;
  //constructor
  public War(){
    
  }

  public void game(Deck deck){//+ get griefed EXD LOLl
    while(playAgain){
      //inputs, they're gonna be set for now
      String output = "";
        
      int randIndex = rand.nextInt(53);
      Card player1 = deck.cards.get(randIndex);
      System.out.println("Player ONE has "+player1 +" and "+ player1.getPoints() +" points");
      deck.cards.remove(randIndex);
  
      int randIndex2 = rand.nextInt(53);
      Card player2 = deck.cards.get(randIndex2);
      System.out.println("Player TWO has "+player2 +" and "+ player2.getPoints() +" points");
      deck.cards.remove(randIndex2);
  
      if(player1.getPoints() > player2.getPoints()){
        output += "Payer 1 wins!";
      }
      else if(player2.getPoints() > player1.getPoints()){
        output += "Payer 2 wins!";
      }else{
        output+= "bruh its a tie :(";
      }
  
      winner = output;
      System.out.println(output);
      
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Play again?");
  
      String replay = myObj.nextLine();  // Read user input
      
      if (replay.equals("Y")){
        playAgain = true;
      }  // Output user input
      else{
        System.out.println("bye bye loser :)");
        playAgain = false;
      }
    }
  }

  public String toString(){
    return winner;
  }
  

  
}








/*  public String game(Deck deck){//+ get griefed EXD LOLl
    //inputs, they're gonna be set for now
    String output = "";
      
    int randIndex = rand.nextInt(53);
    Card player1 = deck.cards.get(randIndex);
    deck.cards.remove(randIndex);

    int randIndex2 = rand.nextInt(52);
    Card player2 = deck.cards.get(randIndex2);
    deck.cards.remove(randIndex2);

    if(player1.getPoints() > player2.getPoints()){
      output += "Payer 1 wins!";
    }
    else if(player2.getPoints() > player1.getPoints()){
      output += "Payer 2 wins!";
    }

    winner = output;
    return output;
  }

  public String toString(){
    return winner;
  }
}
*/