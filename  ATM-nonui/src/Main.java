import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Login Screen
        System.out.println("Enter your username: ");
        String usr = scan.nextLine();
        System.out.println("Enter your password: ");
        String pwd = scan.nextLine();
        new Login(usr,pwd);

    }
}