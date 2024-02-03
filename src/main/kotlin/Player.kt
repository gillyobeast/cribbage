import kotlin.random.Random

class Player(val name: String) {
    private val random: Random = Random(name.hashCode())
    fun cut(deck: Deck): Card {
        return deck.cut(random)
    }

    fun randomCard(): Card {
        val card = hand.random(random)
        hand.remove(card)
        return card
    }

    val hand: MutableSet<Card> = sortedSetOf()
}