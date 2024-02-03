import kotlin.random.Random

class Player(val name: String) {
    private val random: Random = Random(name.hashCode())
    private var score = 0
    fun cut(deck: Deck): Card {
        return deck.cut(random)
    }

    fun randomCard(): Card {
        val card = hand.random(random)
        hand.remove(card)
        return card
    }

    val hand: MutableSet<Card> = sortedSetOf()

    fun score(points: Int){
        score += points
        if (score > 121) throw GameOver(winner = this)
    }
}