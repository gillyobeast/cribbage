import kotlin.random.Random

class Player(val name: String) {
    private val random: Random = Random(name.hashCode())
    fun cut(deck: Deck): Card {
        return deck.cut(random)
    }

    val hand: MutableSet<Card> = sortedSetOf()
}