package Objective
import Card.Agenda

trait Objective {
  // signals that the player has achieved his goal, and thus has won. 
  def bingo = (l: List[Agenda]) => {
    def accumulatorFun(l: List[Agenda], accl: Int): Int = {
      if(l.isEmpty) accl
      else {
    	val a: Int = l.head.value + accl
    	accumulatorFun(l.tail, a)
      }
    }
    accumulatorFun(l, 0) >= 7
  }
}

object MockObject extends App {
  object Mike extends Objective
  val n = new Agenda {
    def value = 3
    def action = () => ()
  }
  
  println(Mike.bingo(List(n, n, n)))
}