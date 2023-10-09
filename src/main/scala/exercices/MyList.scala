package exercices

/*
   head = first element of  the  list
   tail = remainder of the list
   isEmpty = is this list empty
   add(int) => new list with this element added
   toString => a string representation of the list
 */

abstract class MyList {

  def head: Int

  def tail: MyList

  def isEmpty: Boolean

  def add(value: Int): MyList

  def printElements: String

  override def toString: String = "["+ printElements + "]"

}

object Empty extends MyList{

  def head: Int = throw new NoSuchElementException

  def tail: MyList = throw new NoSuchElementException

  def isEmpty: Boolean= true

  def add(value: Int): MyList = new NonEmpty(value, Empty)

  def printElements: String = ""


}

class NonEmpty(h: Int, t: MyList) extends MyList{

  def head: Int = h

  def tail: MyList = t

  def isEmpty: Boolean = false

  def add(value: Int): MyList = new NonEmpty(value, this)

  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements


}

object  ListTest extends App{
  val list = new NonEmpty(1,Empty)
  val listOfIntegers: MyList = new NonEmpty(1, new NonEmpty(2, new NonEmpty(3, Empty)))

  println(listOfIntegers.toString)

}