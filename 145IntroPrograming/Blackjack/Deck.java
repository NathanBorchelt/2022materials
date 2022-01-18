//Nathan Borchelt
//Assignment 7: Blackjack
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://www.journaldev.com/32661/shuffle-array-java
import java.util.Random;

public class Deck {
    private Card[] deckOfCards;
    private Random rand;
    public Deck(){
        
        Card[] cardArray = new Card[52];
        rand = new Random();
        String[] suits = {"Diamonds", "Spades","Hearts","Clubs"};
        String[] faceName = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int[] faceValue = {11,2,3,4,5,6,7,8,9,10,10,10,10};

        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < faceName.length; j++){
                cardArray[((i*13)+j)] = new Card(suits[i],faceName[j],faceValue[j]);
            }
        }
        //https://www.journaldev.com/32661/shuffle-array-java
        List<Integer> cardList = new ArrayList<>();
        for(int i = 0; i < 52; i++){
            cardList.add(i);
        }
        Collections.shuffle(cardList);
        Card[] tempDeck = cardArray.clone();
        for (int i = 0; i < tempDeck.length; i++) {
            tempDeck[i] = cardArray[cardList.get(i)];
        }
        deckOfCards = tempDeck;
    }

    public Card getCard(int index){
        return deckOfCards[index];
    }

    public Card dealCard(){
        int randCardIndex = rand.nextInt(deckOfCards.length);
        Card dealtCard = deckOfCards[randCardIndex];
        while (deckOfCards[randCardIndex] == null){
            randCardIndex = rand.nextInt(deckOfCards.length);
            dealtCard= deckOfCards[randCardIndex];
        }
        deckOfCards[randCardIndex]= null;
        return dealtCard;
    }

    public String toString() {
        String outString = "";
        for(Card c : deckOfCards){
            outString += (c + "\n");
        }
        return outString;
    }
}
