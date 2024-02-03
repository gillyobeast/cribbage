data class Card(val value: Value, val suit: Suit) : Comparable<Card> {
    override fun compareTo(other: Card): Int {
        return if (this.value == other.value) {
            this.suit.compareTo(other.suit)
        } else {
            this.value.compareTo(other.value)
        }
    }

    override fun toString() = "$value$suit"
}


enum class Value(val symbol: String) {
    Ace("A"), Two("2"), Three("3"), Four("4"),
    Five("5"), Six("6"), Seven("7"), Eight("8"),
    Nine("9"), Ten("10"), Jack("J"), Queen("Q"),
    King("K");

    override fun toString() = symbol
}

enum class Suit(val symbol: String) {
    Spades("♠"), Hearts("♥"), Clubs("♣"), Diamonds("♦");

    override fun toString() = symbol

}

/* IDK if it'll be used, but it's neat! */
infix fun Value.of(suit: Suit): Card = Card(this, suit)
