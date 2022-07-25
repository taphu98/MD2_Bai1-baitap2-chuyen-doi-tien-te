import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD, rate;
        System.out.println("Nhập số tiền USD: ");
        USD = scanner.nextDouble();
        rate = 23000*USD;
        System.out.println("Số tiền là: " + rate + "VND");
    }
}