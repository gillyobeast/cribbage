data class Card(val value: Value, val suit: Suit) {
    override fun toString(): String {
        return "$value of $suit"
    }
    enum class Value {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }
    enum class Suit {
        Spades, Hearts, Clubs, Diamonds
    }
    /* IDK if it'll be used, but it's neat! */
    infix fun Value.of(suit: Suit): Card = Card(this, suit)
}
