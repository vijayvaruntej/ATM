
import java.util.Scanner;

class ATM{
    float balance;
    int Pin= 123;

    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin ==  Pin ){
            menu();
        }else{
            System.out.println("Enter a valid pin.");
            checkPin();
        }

    }

    public void menu(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("1. Check A/C Balance \n2. Withdraw Money \n3. Deposit Money \n4.EXIT");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt){
            case 1: checkBalance();
                break;
            case 2: withdrawMoney();
                break;
            case 3: depositMoney(); break;
            case 4: System.out.println("Thank you for using the ATM. Goodbye!");
                return;
            default:
                System.out.println("Enter a valid number.");
        }

    }

    public void checkBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }
    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you want to withdraw?");
        float x = sc.nextFloat();
        if(balance >= x){
            balance = balance - x;
            System.out.println("Money withdrawal successfully");
        }else{
            System.out.println("Insufficient Balance.");
            System.out.println("Money withdrawal unsuccessfully");
        }
    }

    public void depositMoney(){
        System.out.println("Enter money much money you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        float depositAmout = sc.nextFloat();
        balance = balance + depositAmout;
        System.out.println(" Your money is successfully Deposited.\n Your current balance is: "+balance);
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args){
        ATM obj = new ATM();
        System.out.println("Note: This is demo purpose. Please use password: 123 to use the ATM");
        obj.checkPin();
    }
}
