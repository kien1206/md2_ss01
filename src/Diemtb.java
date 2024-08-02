import java.util.Scanner;
public class Diemtb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm Toán: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm Văn: ");
        double literatureScore = scanner.nextDouble();

        System.out.print("Nhập điểm Anh: ");
        double englishScore = scanner.nextDouble();

        double averageScore = (mathScore + literatureScore + englishScore) / 3;

        System.out.printf("Tổng trung bình cộng của ba điểm là: %.2f\n", averageScore);

        scanner.close();
    }
}