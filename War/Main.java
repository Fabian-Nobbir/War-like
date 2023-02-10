import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Deck deck = new Deck();
    War war = new War();
    System.out.println("█░░░█ █▀▀ █░░ █▀▀ █▀▀█ █▀▄▀█ █▀▀   ▀▀█▀▀ █▀▀█  █░░░█ █▀▀█ █▀▀█ █");
    System.out.println("█▄█▄█ █▀▀ █░░ █░░ █░░█ █░▀░█ █▀▀   ░░█░░ █░░█  █▄█▄█ █▄▄█ █▄▄▀ ▀");
    System.out.println("░▀░▀░ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀░░░▀ ▀▀▀   ░░▀░░ ▀▀▀▀  ░▀░▀░ ▀░░▀ ▀░▀▀ ▄");
    System.out.println("         ▀▄▀▄▀▄▀▄▀▄▀▄ By Michael and Fabian ▄▀▄▀▄▀▄▀▄▀▄▀        ");


    
    
    war.game(deck);
    
  }
}