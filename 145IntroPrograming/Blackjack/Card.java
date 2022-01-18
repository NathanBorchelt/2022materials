//Nathan Borchelt
//Assignment 7: Blackjack
public class Card {
    private String suit;
    private String faceName;
    private int cardValue;

    public Card(String suit, String faceName, int cardValue){
        this.cardValue = cardValue;
        this.suit = suit;
        this.faceName = faceName;
    }

    public void hardHand(){
        cardValue = 1;
    }

    public int getCardValue(){
        return cardValue;
    }

    public String toString() {
        return (faceName + " of " + suit);
    }
}
