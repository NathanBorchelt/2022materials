//Nathan Borchelt
//Assignment 7: Blackjack
import java.util.ArrayList;
public class Hand {
    private static ArrayList<Card> hand;
    private int pointValue;
    public Hand(Card holdCard, Card faceCard){
        hand = new ArrayList<>();
        hand.add(holdCard);
        hand.add(faceCard);
    }

    public int getPoints(){
        pointValue = pointValueCalc(hand);
        return pointValue;
    }

    public void drawCard(Deck deck){
        hand.add(deck.dealCard());

    }

    private static int pointValueCalc(ArrayList<Card> hand){
        int totalValue = 0;
        for(Card c : hand){
            totalValue += c.getCardValue();
        }
        if(totalValue>21){
            for(int i = 0; i < hand.size(); i++){
                Card aceCheck = hand.get(i);
                if(aceCheck.toString().contains("Ace") && aceCheck.getCardValue()!=1){
                    aceCheck.hardHand();
                    totalValue-=10;
                }
            }
        }
        return totalValue;
    }

    public String toString(){
        System.out.printf("%-10s: %s%n", "Hole Card",hand.get(0));
        System.out.printf("%-10s: %s%n", "Up Card(s)", hand.get(1));
        if(hand.size()>2){
            for(int i = 2; i < hand.size(); i++){
                System.out.printf("%-11s %s%n", "", hand.get(i));
            }
        }
        return "";
    }
}
