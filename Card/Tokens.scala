package Card

sealed abstract class Token extends GameEntity
case class Credit()              extends Token
case class AdvancementCounter()  extends Token
case class TraceCounter()        extends Token
case class BadPublicityCounter() extends Token
case class BrainDamageCounter()  extends Token
case class VirusCounter()        extends Token