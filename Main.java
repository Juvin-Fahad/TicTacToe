import java.util.*;
public class Main {
    public static void main(String[] args) {
        int choice;
        boolean startgame = false;
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        System.out.println("Welcome to the TicTacToe game!");
        System.out.println("Enter 1 for play\n2 for exit:");
        choice = sc.nextInt();
        if (choice == 2) System.exit(0);
        if (choice == 1)
            startgame = true;
            else System.out.println("Invalid Choice.Exiting the program");
        while (startgame) {
            g.start();
            System.out.println("Do you want to play again?(y/n): ");
            char ch = sc.next().charAt(0);
            if(ch=='n' || ch == 'N') startgame = false;
        }
        sc.close();
    }
}