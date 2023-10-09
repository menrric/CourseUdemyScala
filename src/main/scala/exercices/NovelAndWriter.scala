package exercices

/*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname -> prints full name

  Novel: name, year of release, author
  - authorAge -> prints author's age
  - isWrittenBy(author) -> checks if the given author is the writer of the novel
  - copy (new year of release) = new instance of Novel
 */

object NovelAndWriter extends App{

  val writer = new Writer("Howard Phillips", "Lovecraft", 1890)
  val writerFake = new Writer("Howard Fake", "Lovecraft", 1890)
  val novel = new Novel("La ciudad sin nombre", 1921, writer)

  writer.fullname()
  println(s"La novela fue escrita cuando su autor tenía ${novel.authorAge()}")
  println(novel.isWrittenBy(writer))
  println(novel.isWrittenBy(writerFake))
}

class Writer(val fName: String, val sName: String, val year: Int){

  def fullname(): Unit = println(s"The full name of the writer is: ${this.fName} ${this.sName} ")
}

class Novel(name: String, val year: Int, author: Writer){

  def authorAge(): Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYear: Int): Unit = new Novel(name, newYear, author)
}

