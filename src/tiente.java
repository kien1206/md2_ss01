import java.util.Scanner;
public class tiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double usd = scanner.nextDouble();
        System.out.print("Nhập tỉ giá (VNĐ/USD): ");
        double exchangeRate = scanner.nextDouble();
        double vnd = usd * exchangeRate;
        System.out.printf("Số tiền tương ứng bằng VNĐ: %.2f\n", vnd);
        scanner.close();
    }

}
