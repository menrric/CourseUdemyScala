package exercices

import scala.language.postfixOps

/*
  1.  Overload the + operator
      mary + "the rockstar" => new person "Mary (the rockstar)"

  2.  Add an age to the Person class
      Add a unary + operator => new person with the age + 1
      +mary => mary with the age incrementer

  3.  Add a "learns" method in the Person class => "Mary learns Scala"
      Add a learnsScala method, calls learns method with "Scala".
      Use it in postfix notation.

  4.  Overload the apply method
      mary.apply(2) => "Mary watched Inception 2 times"
 */
object ExercicesMethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nick: String): Person = new Person(s"$name, $nick", favoriteMovie)

    def unary_! : String = s"$name, what the heck?!"

    def unary_+ : Person = new Person(name, favoriteMovie, age+1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def apply(number: Int) : String = s"$name watched $favoriteMovie $number times"

    def learns(what: String): String = s"$name learns $what"

    def learnsScala: String = this learns "Scala"


  }

  val mary = new Person("Mary", "Inception")

  println((mary + "the Rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))

}
