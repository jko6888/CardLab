package JamesKo;

public class DeckTester {
    public static void main (String[] args) {
        String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        DeckClass deck = new DeckClass(ranks, suits, pointValues);
        deck.shuffle();
        while (!deck.isEmpty()) {
            System.out.println(deck.deal());
        }

    }
}
