object Hello extends App {

  def apply(listOfNumbers : List[Int], nthTerm : Int) : Int  = {
    if (listOfNumbers == Nil) {throw new Exception("no numbers to choose from")}
    if (listOfNumbers.distinct.size < nthTerm) {throw new Exception("index not allowed")}
    listOfNumbers.distinct.sorted.reverse(nthTerm-1)
  }
}
