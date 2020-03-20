import cern.colt.matrix.{DoubleFactory2D, DoubleMatrix2D}
import cern.colt.matrix.{DoubleFactory1D, DoubleMatrix1D}

import scala.collection.mutable.ListBuffer

class Markowitz extends PortOptiMode{
  val result = ListBuffer[Double](100)

  def createEfficientFrontier  = {
    numberOfShares match {
      case 2 => {
        //do not have to perform any kind of optimization. only 2 shares
        val test = ListBuffer[Double](100)

        for(i <- 1 until 100 by 1){
          val sharesDef = DoubleFactory1D.dense.make(2)
          sharesDef.set(0,i.toDouble/100)
          sharesDef.set(1,(100-i.toDouble)/100)
          val mu    = sharesDef.zDotProduct(returns)
          val sigma = sharesDef.zDotProduct(covMatrix.zMult(sharesDef,null))

          result += (mu,sigma)
        }
      }
      case _ => print("not implemented yet")
    }
  }

}
