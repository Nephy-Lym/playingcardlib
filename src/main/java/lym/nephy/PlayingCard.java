package lym.nephy;

public class PlayingCard {
    private final Pip mPip;
    private final int mValue;
    private final Suit mSuit;

    public PlayingCard(Pip pPip, int pValue, Suit pSuit) {
        mPip = pPip;
        mValue = pValue;
        mSuit = pSuit;
    }

    public Pip getPip() {
        return mPip;
    }

    public int getValue() {
        return mValue;
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

        return otherCard.getPip() == this.getPip()
            && otherCard.getSuit() == this.getSuit();
    }

    @Override
    public String toString() {
        return this.getPip().toString() + " of " + this.getSuit().toString();
    }

}
