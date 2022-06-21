import java.util.Scanner;

public class ui {
    Scanner scan = new Scanner(System.in);
    public ui() {
        //operation
        int balance = 8753;
        System.out.println("Chose your operation");
        System.out.println("1. Check balance");
        System.out.println("2. Recent transactions");
        System.out.println("3. Deposit money");
        System.out.println("4. Withdraw money");
        System.out.println("5. Quit my account");
        int ch = scan.nextInt();
        //Start Operation
        switch (ch){
            case 1:
                System.out.println("Wait a second...");
                System.out.println("Your balance is "+balance+ "$");
                break;

            case 2:
                System.out.println("Deposit 478$ from Alex"+"\nWithdraw 60$ to Jeff");
                System.out.println("1602$ In return 1000£ you got (FX Transaction)");
                break;

            case 3:
                System.out.println("How much deposit from your account ");
                int amount = scan.nextInt();
                balance+=amount;
                System.out.println("Operation is successful "+balance+"$");
                break;
            case 4:
                System.out.println("How much withdraw from your account");
                amount= scan.nextInt();
                balance-=amount;

                if(balance<amount){
                    System.out.println("Your balance is not enough for this operation. ");

                }
                else {
                    System.out.println("Your account balance is "+balance+" USD");}
                break;

            case 5:
                System.out.println("Quitting the system..."+"\n "+"\nTake care");


        }



    }

}
