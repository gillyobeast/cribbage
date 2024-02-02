data class Card(val value: Value, val suit: Suit) : Comparable<Card> {
    override fun compareTo(other: Card): Int {
        return if (this.value == other.value) {
            this.suit.compareTo(other.suit)
        } else {
            this.value.compareTo(other.value)
        }
    }

    override fun toString() = "$value of $suit"


}


enum class Value {
    Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
}

enum class Suit {
    Spades, Hearts, Clubs, Diamonds
}

/* IDK if it'll be used, but it's neat! */
infix fun Value.of(suit: Suit): Card = Card(this, suit)
