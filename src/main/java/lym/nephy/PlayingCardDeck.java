package lym.nephy;

import java.util.Hashtable;
import java.util.LinkedList;

public class PlayingCardDeck {
    private LinkedList<PlayingCard> mDeck;

    public PlayingCardDeck(Hashtable<Pip, Integer> config) {
        mDeck = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Pip pip = Pip.values()[j];
                mDeck.add(new PlayingCard(pip, config.get(pip), Suit.values()[i]));
            }
        }
    }

    public static void main(String[] pArgs) {
        Hashtable<Pip, Integer> config = new Hashtable<>();
        config.put(Pip.ACE, 1);
        config.put(Pip.TWO, 2);
        config.put(Pip.THREE, 3);
        config.put(Pip.FOUR, 4);
        config.put(Pip.FIVE, 5);
        config.put(Pip.SIX, 6);
        config.put(Pip.SEVEN, 7);
        config.put(Pip.EIGHT, 8);
        config.put(Pip.NINE, 9);
        config.put(Pip.TEN, 10);
        config.put(Pip.JACK, 10);
        config.put(Pip.QUEEN, 10);
        config.put(Pip.KING, 10);

        PlayingCardDeck deck = new PlayingCardDeck(config);

        System.out.print("debug");
    }

}
