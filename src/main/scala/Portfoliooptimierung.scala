object Portfoliooptimierung extends App{
  // idea is to implement various versions of optimization approaches

  val markowitz = new Markowitz


  markowitz.createEfficientFrontier
  print(markowitz.result)

}
