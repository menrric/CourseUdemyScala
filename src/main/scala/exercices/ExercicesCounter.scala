package exercices

/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */

object ExercicesCounter extends App{
  val counter = new Counter
  counter.increment().currentCount()
  counter.increment().increment().increment().currentCount()
  counter.increment(10000).currentCount()
}

class Counter(val value : Int = 0){

  def currentCount(): Unit = println(value)
  def increment(): Counter = new Counter(value + 1)
  def decrement(): Counter = new Counter(value - 1)
  def increment(number: Int): Counter = new Counter(value + number)
  def decrement(number: Int ): Counter = new Counter(value - number)


}