import kotlin.random.Random

typealias Deck = ArrayDeque<Card>

fun Deck.cut(): Card = this[Random.nextInt(this.size)]

fun Deck.takeOne() = removeFirst()

fun newShuffledDeck(): Deck {
    val deck = Deck(52)
    for (suit in Suit.entries) {
        for (value in Value.entries) {
            deck.add(value of suit)
        }
    }
    return Deck(deck.shuffled())
}

