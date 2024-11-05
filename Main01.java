import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String biner = "";

        do {
            int bit = n % 2;
            biner = bit + biner;
            n /= 2;
        } while (n > 0);

        System.out.println(biner);
    }
}
