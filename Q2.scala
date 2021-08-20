//Q2)Create a method sub to subtract two rational numbers and find an answer  x-y-z where x=3/4, y=5/8, z=2/7.
object Q2 extends App(){
  val R1= new Rational(2,3);
  val R2 = new Rational(4,7);
  val R3 = new Rational(8,1);
  val result = R1.sub(R2).sub(R3);
  println (result);

  class Rational(a:Int,b:Int){
    def numer = a;
    def denom=b;
    def +(r:Rational) = new Rational(this.denom*r.numer + this.numer*r.denom,this.denom*r.denom);

    def neg = new Rational(- this.numer,this.denom);//getting the neg value of given
    def sub(r:Rational) = this + r.neg ;
    override def toString= "[" + numer + "/" + denom + "]";
  }


}