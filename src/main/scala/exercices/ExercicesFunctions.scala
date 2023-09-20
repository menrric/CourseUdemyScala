package exercices

import scala.annotation.tailrec

object ExercicesFunctions extends App {

  /*
    Exercises:
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Factorial function 1 * 2 * 3 * .. * n
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Tests if a number is prime.
   */


  def exerciceOne(name: String, age: Int): Unit ={
    println(s"Hi, my name is $name and I am $age years old.")
  }
  exerciceOne("Manuel", 23)


  def factorial(number: Int) : Int = {

    if (number <= 0) 1
    else number*factorial(number-1)
  }

  println(factorial(10))

  def fibonacci(n: Int): Int ={
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(6))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(15))
  println(isPrime(23))

}
