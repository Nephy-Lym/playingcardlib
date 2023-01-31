package lym.nephy;

public class PlayingCard {
    private enum Suit {
        SPADES, DIAMONDS, CLUBS, HEARTS
    }

    private enum Value {
        ACE (1),
        TWO (2),
        THREE (3),
        FOUR (4),
        FIVE (5),
        SIX (6),
        SEVEN (7),
        EIGHT (8),
        NINE (9),
        TEN (10),
        JACK (11),
        QUEEN (12),
        KING (13);

        private int mNumValue;

        Value(int pNumValue) {
            setNumValue(pNumValue);
        }

        protected void setNumValue(int pNumValue) {
            mNumValue = pNumValue;
        }

        public int getNumValue() {
            return mNumValue;
        }
    }

    private final Value mValue;
    private final Suit mSuit;

    public PlayingCard(Value pValue, Suit pSuit) {
        mValue = pValue;
        mSuit = pSuit;
    }

    public void setNumValue(int pNumValue) {
        getValue().setNumValue(10);
    }


    public Value getValue() {
        return mValue;
    }

    public int getNumValue() {
        return getValue().getNumValue();
    }

    public Suit getSuit() {
        return mSuit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;

        PlayingCard otherCard = (PlayingCard) other;

        return this.getValue() == otherCard.getValue()
                && this.getSuit() == otherCard.getSuit();
    }

    @Override
    public String toString() {
        return getValue().toString() + " of " + getSuit().toString();
    }
}
