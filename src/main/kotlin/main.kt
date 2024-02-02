fun main() {
    val deck = newShuffledDeck()

    val player1 = Player()
    val player2 = Player()
    deck.deal(6, player1.hand, player2.hand)

    println(player1.hand)
    println(player2.hand)
}




