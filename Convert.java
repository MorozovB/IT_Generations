import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Bitcoin price today?");
        int bitcoin = sc.nextInt();
        System.out.println("How much $ do you have?");
        int usd = sc.nextInt();
        double answer = (double)usd / bitcoin;
        System.out.println("How much $ do you have? " + answer + " BTC");

    }
}
