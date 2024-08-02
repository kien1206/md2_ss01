import java.util.Scanner;
public class Hinhtron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính của đường tròn: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Chu vi của đường tròn: %.2f\n", circumference);
        System.out.printf("Diện tích của đường tròn: %.2f\n", area);

        scanner.close();
    }
}