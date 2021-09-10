//Q2)Create a method sub to subtract two rational numbers and find an answer  x-y-z where x=3/4, y=5/8, z=2/7.
object Q2 extends App(){
  val R1 = new Rational(3,4);
  val R2 = new Rational(5,8);
  val R3 = new Rational(2,7);
  val result = R1.sub(R2).sub(R3);
  println (result);
  val final_result = result.ApplyGCD;
  print("Equivalent Fraction of answer : ");
  println (final_result);

  class Rational(a:Int,b:Int){
    def numer = a;
    def denom=b;
    def +(r:Rational) = new Rational(this.denom*r.numer + this.numer*r.denom,this.denom*r.denom);

    //getting the neg value of given
    def neg = new Rational(- this.numer,this.denom);
    def sub(r:Rational) = this + r.neg ;

    def ApplyGCD = new Rational(this.numer/gcd(this.numer,this.denom),this.denom/gcd(this.numer,this.denom));

    override def toString= if(denom>0) "[" + numer + "/" + denom + "]" else "[" + (-1)*numer + "/" + (-1)*denom + "]" ;
  }
  def gcd(a:Int, b:Int) : Int = if (b == 0) a else gcd(b,a%b);
}
