package lec9;

class ATM{
private int TotalBalance=20000;
public void getBalance(){
    System.out.println(TotalBalance);
}
public void setDeposite(int amount){
    if(amount>0){
    TotalBalance+=amount;
    }
}
public void setWithdraw(int amount){
    if(amount>0 && amount<=TotalBalance){
        TotalBalance-=amount;
    }
}
}

public class Encapsulation {
    public static void main(String[] args) {
        ATM a1=new ATM();
        a1.getBalance();
        a1.setDeposite(1000);
        a1.getBalance();
        a1.setWithdraw(1200);
        a1.getBalance();
    }
}
