import org.platanios.tensorflow.api.tensors._
import org.platanios.tensorflow.api.Tensor


trait PortOptiMode {
  val numberOfShares  = 2
  // using risk free asset should also be considered

  // vorschlag: tensorflow benutzen. ansonsten muss man in vielen punkten auf java uebergehen...
  val covarianceMatrix = Tensor[Double](Tensor[Double](0.8,0.5),Tensor[Double](0.5,1.0))
  val returns = Tensor[Double](0.4,0.6)

  def getReturns: Tensor[Double] = {
    returns
  }

  def getCovMatrix : Tensor[Double] = {
    covarianceMatrix
  }


}
