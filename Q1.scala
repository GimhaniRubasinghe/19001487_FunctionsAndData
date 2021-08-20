//Q1)Implement a Data Structure for Rational Number and create a method neg to class Rational that is used like this: x.neg // evaluates to -x
object Q1 extends App(){
  val R1 = new Rational(2,3);
  println(R1);

  val R2 = R1.neg;
  print(R2);
}

class Rational(a:Int,b:Int){
  def numer = a;
  def denom=b;
  def neg = new Rational(- this.numer,this.denom);//getting the neg value of given

  override def toString= "[" + numer + "/" + denom + "]";
}

