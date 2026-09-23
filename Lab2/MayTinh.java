import java.util.Scanner;

public class MayTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a");
        double num1 = sc.nextDouble();

        System.out.println("Nhap vao b");
        double num2 = sc.nextDouble();

        System.out.println("Nhap phep toan");
        char phepToan = sc.next().charAt(0);

        switch (phepToan) {
            case '+' -> System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
            case '-' -> System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
            case '*' -> System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
                }
            } // <- Đã thêm dấu đóng ngoặc nhọn ở đây
            default -> System.out.println("Phep toan khong hop le");
        }

        sc.close();
    }
}
