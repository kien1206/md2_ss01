import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
        scanner.close();
    }
}