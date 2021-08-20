//Q3)Implement a Data Structure for Account and create a method transfer which transfer the money from this account to a given account.

object Q3 extends App{
  var A1 = new Account("997791312v",127123456,"Gimhani",645.13)
  var A2 = new Account("998765357v",127098765,"Abiman",-341.20)
  println(A1);
  println(A2);

  A1.Transfer(A2, 100);//A1 transfer money to A2
  println(A1);
  println(A2);

  class Account(a:String,b:Int,c:String,d:Double){
    val NIC = a;
    val Account_no = b;
    val Name = c;
    var Balance = d;

    def Deposit(m:Double) = (this.Balance += m)
    def Withdraw(m:Double) = (this.Balance -= m)

    def Transfer(m1:Account,m2:Double) = {this.Withdraw(m2)
      m1.Deposit(m2)}
    override def toString = "[" + NIC + "," + Account_no + "," + Name + ", Rs." + Balance + "]"
  }
}