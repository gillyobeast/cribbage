fun main() {

    var players = decideDealer()
    var (dealer, nonDealer) = players

    // game loop starts here
    println("dealer is player ${dealer.name}, player ${nonDealer.name} is next")

    val deck = newShuffledDeck()
    // the deal
    deck.deal(6, dealer.hand, nonDealer.hand)

    println("dealer hand: ${dealer.hand}")
    println("nonDealer hand: ${nonDealer.hand}")

    // the crib
    val crib = players.discardToCrib()
    println("crib: $crib")

    println("dealer hand: ${dealer.hand}")
    println("nonDealer hand: ${nonDealer.hand}")

    // the cut:
    val cut = nonDealer.cut(deck)
    if (cut.value == Value.Jack) dealer.score(2)

    // to swap:
    //  dealer = nonDealer.also { nonDealer = dealer }
    // then restart game loop
    // wrap in a try-catch for GameOver, and announce the winner
}

private fun decideDealer(): Pair<Player, Player> {
    val deck = newShuffledDeck()
    val player1 = Player("one")
    val player2 = Player("two")
    val comparison = player1.cut(deck).value.compareTo(player2.cut(deck).value)
    return when {
        comparison < 0 -> player1 to player2
        comparison > 0 -> player2 to player1
        // cut again if both get same card value
        else -> decideDealer()
    }
}




