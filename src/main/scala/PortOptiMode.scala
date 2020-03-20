import cern.colt.matrix.{DoubleFactory2D, DoubleMatrix2D}
import cern.colt.matrix.{DoubleFactory1D,DoubleMatrix1D}


trait PortOptiMode {
  val numberOfShares  = 2
  // using risk free asset should also be considered

  // vorschlag: tensorflow benutzen. ansonsten muss man in vielen punkten auf java uebergehen...
  val covMatrix = DoubleFactory2D.dense.make(2,2)
  covMatrix.set(0,0,0.8)
  covMatrix.set(0,1,0.5)
  covMatrix.set(1,0,0.5)
  covMatrix.set(1,1,0.4)

  val returns = DoubleFactory1D.dense.make(2)
  returns.set(0,0.8)
  returns.set(1,0.4)
}
