package Player
import Card._
import scala.util.Random

abstract class Player {
  type Deck = List[Card]
  type Pile = Set[Card]
  protected var deck: Deck = _
  
  private var maxHand = 5
  def spendClick: Unit
  def initDeck(d: Deck): Unit = {
    deck = Random.shuffle(d)
  }
  def startTurn(): Unit
}
import Objective._
object Runner extends Player with Objective {
  
}

object Corporation extends Player with Objective {
  
}