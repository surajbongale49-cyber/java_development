import java.util.Scanner;
class BankAccount{
    int AccountNo;
    String accountHolderName;
    int balance;
    void show(int AccountNo,String accountHolderName,int balance){
        this.AccountNo=AccountNo;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    void display(){
        System.out.println("AccountNo :-"+AccountNo);
        System.out.println("accountHolderName :-"+accountHolderName);
        System.out.println("Ammount :-"+balance);
    }
}
public class Bank {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    BankAccount b=new BankAccount();
    System.out.println("Enter the BankAccount Number  :-");
    int AccountNo=sc.nextInt();
    // Consume leftover Enter
    sc.nextLine();
    System.out.println("Enter the Name of Accounter :");
    String accountHolderName=sc.nextLine();
    System.out.println("Eneter the Ammount :");
    int balance=sc.nextInt();
    b.show(AccountNo,accountHolderName,balance);
    b.display();
  }
}
