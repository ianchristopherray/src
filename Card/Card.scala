package Card
import Faction._

abstract class Card extends GameEntity
abstract class RunrCard         extends Card with RunrFaction
abstract class CorpCard         extends Card with CorpFaction

// Identity
abstract case class RunrID()    extends RunrCard
abstract case class CorpID()    extends CorpCard
// Runner cards
abstract case class Event()     extends RunrCard
abstract case class Hardware()  extends RunrCard
abstract case class Program()   extends RunrCard
abstract case class Resource()  extends RunrCard

// Corporation cards
abstract case class Agenda()    extends CorpCard {
  def value: Int
  def action: () => Unit
}
abstract case class Asset()     extends CorpCard
abstract case class Ice()       extends CorpCard {
  protected val advanceable: Boolean
  protected var advancementCounters: Int
  /* there are cards with added
   * rezz costs.*/
  def rezz: List[GameEntity] => Unit 
  /* typically, you'll just take 
   * advancement tokens, but there 
   * could be added costs 
   * for advancement. */
  def advance: List[GameEntity] => Unit 
}
abstract case class Operation() extends CorpCard
abstract case class Upgrade()   extends CorpCard