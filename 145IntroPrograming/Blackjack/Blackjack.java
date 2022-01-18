//Nathan Borchelt
//Assignment 7: Blackjack
import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args) {
        String condition = "lose";
        Scanner in = new Scanner(System.in);
        boolean stillPlaying = true;
        Deck deck = new Deck();
        Hand playerHand = new Hand();
        playerHand.drawCard(deck);
        playerHand.drawCard(deck);
        String playerInput = "";
        if(playerHand.getPoints()==21){
            stillPlaying=false;
            condition = "blackjack";
        }
        while(stillPlaying){
            System.out.print(playerHand);
            System.out.printf("%-10s: %d\n", "Points", playerHand.getPoints());
            System.out.println("1. Hit\n2. Stand");
            if(playerHand.getPoints() > 21){
                condition = "bust";
                break;
            }
            playerInput = in.nextLine();
            if(playerInput.trim().equals("1"))
                playerHand.drawCard(deck);
            else if(playerInput.trim().equals("2")){
                stillPlaying = false;
                if(playerHand.getPoints() == 17)
                    condition = "tie";
                else if(playerHand.getPoints() > 17)
                    condition = "win";
            }
            else
                System.out.println("That is an invalid input, try again.");
            
        }
        in.close();
        if(condition.equals("bust"))
            System.out.printf("Bust! You scored %d, there is a limit of 21.\n", playerHand.getPoints());
        else if( condition.equals("tie"))
            System.out.println("You Tied. Both of you and the dealer scored 17.");
        else if( condition.equals("lose"))
            System.out.printf("You lose. You scored %d, losing the dealer by %d.\n", playerHand.getPoints(), 17-playerHand.getPoints());
        else if( condition.equals("blackjack"))
            System.out.println("You were dealt a blackjack.\n"+playerHand);
        else
            System.out.printf("You Win! You scored %d, beating the dealer by %d.\n", playerHand.getPoints(), playerHand.getPoints()-17);
    }
    
}
