//Nathan Borchelt
//Assignment 7: Blackjack
public class Hand {
    private static Card[] hand;
    private int pointValue;
    public Hand(Card holdCard, Card faceCard){
        hand = new Card[12];
        hand[0] = holdCard;
        hand[1] = faceCard;
    }
    public Hand(){
        hand = new Card[12];
    }


    public int getPoints(){
        pointValue = pointValueCalc(hand);
        return pointValue;
    }

    public void drawCard(Deck deck){
        int addIndex = 0;
        for (int i = 0; i < hand.length; i++) {
            if(hand[i] == null){
                addIndex = i;
                break;
            }            
        }
        hand[addIndex] = deck.dealCard();

    }

    private static int pointValueCalc(Card[] hand){
        int totalValue = 0;
        for(Card c : hand){
            if ( c != null )
                totalValue += c.getCardValue();
        }
        if(totalValue>21){
            for(int i = 0; i < hand.length; i++){
                Card aceCheck = hand[i];
                if ( aceCheck != null ){
                    if(aceCheck.toString().contains("Ace") && aceCheck.getCardValue()!=1){
                        aceCheck.hardHand();
                        totalValue-=10;
                    }
                }
            }
        }
        return totalValue;
    }

    public String toString(){
        System.out.printf("%-10s: %s%n", "Hole Card",hand[0]);
        System.out.printf("%-10s: %s%n", "Up Card(s)", hand[1]);
        for(int i = 2; i < hand.length; i++){
            if (hand[i] != null)
                System.out.printf("%-11s %s%n", "", hand[i]);
        }
        return "";
    }
}
