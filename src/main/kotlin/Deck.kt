import kotlin.random.Random

typealias Deck = ArrayDeque<Card>

fun Deck.cut(random: Random): Card = this[random.nextInt(this.size)]

fun Deck.topCard() = removeFirst()

fun Deck.deal(cards: Int, vararg hands: MutableSet<Card>) {
    repeat(cards) {
        for (hand in hands) {
            hand += topCard()
        }
    }
}

fun newShuffledDeck(): Deck {
    val deck = Deck(52)
    for (suit in Suit.entries) {
        for (value in Value.entries) {
            deck.add(value of suit)
        }
    }
    return Deck(deck.shuffled())
}

