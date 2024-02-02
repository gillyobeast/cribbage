fun main() {
    val deck = newShuffledDeck()

    val hand1 = sortedSetOf<Card>()
    val hand2 = sortedSetOf<Card>()
    do {
        hand1 += deck.takeOne()
        hand2 += deck.takeOne()
    } while (hand1.size < 6)

    println(hand1)
    println(hand2)
}




