import java.util.Scanner;

class Account{
    String bank_name;
    long Account_id;
    String Account_name;
    long balance;
    int password;

    public void get_account_deatil(){
        
    }
    public void  display(){
        System.out.println("Bank_Name: "+this.bank_name);
        System.out.println("Account No: "+this.Account_id);
        System.out.println("Account Name: "+this.Account_name);
        System.out.println("Balance: "+this.balance);
    }
    public void withdraw_money(long amount){
        this.balance=(this.balance-amount);
    }
    public void Deposite_money(long amount){
        this.balance=(this.balance+amount);
    }
    public boolean validate_pass(int pass)
    {
        if(this.password==pass){
            return true;
        }else{
            return false;
        }
    }
   
}
public class Bank {
    public static void main(String[] args) {
        Account ob=new Account();
        int pass;
        long amount,aid;
        String bname,accname;
        Scanner sc=new Scanner(system.in);
        System.out.print("Enter Password: ");
        pass=sc.nextInt();
        if()
    }
}
