import java.util.Scanner;
public class Hinhvuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh của hình vuông: ");
        double sideLength = scanner.nextDouble();

        double perimeter = 4 * sideLength;
        double area = sideLength * sideLength;

        System.out.printf("Chu vi của hình vuông: %.2f\n", perimeter);
        System.out.printf("Diện tích của hình vuông: %.2f\n", area);

        scanner.close();
    }
}
