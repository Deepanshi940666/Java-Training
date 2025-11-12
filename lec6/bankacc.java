package lec6;
class details{
    int accNo;
    String accHolder;
    double balance;

    void deposit(int money){
      balance+=money;
      System.out.println("your money is deposited successfully.");
      System.out.println("now total balance is "+balance);
    
    }

    void withdraw(int money){
        balance-=money;
         System.out.println("your money is withdraw successfully.");
         System.out.println("now total balance is "+balance);
    }

    void disp(){
        System.out.println("Account Number:"+accNo);
        System.out.println("Account Holder:"+accHolder);
        System.out.println("Balance:"+balance);

    }
 
}

public class bankacc {
    public static void main(String[] args) {
        details s1=new details();
        s1.accNo=234567;
        s1.accHolder="arpita";
        s1.balance=3000;
        s1.disp();
        s1.deposit(300);
        s1.withdraw(600);

    }    
}
