object Portfoliooptimierung extends App{
  // idea is to implement various versions of optimization approaches

  val markowitz = new Markowitz
  print(markowitz.getCovMatrix.entriesIterator.toArray)

}
