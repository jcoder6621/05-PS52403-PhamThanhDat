import java.util.Scanner;

public class XepLoaiHocLuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao toan:");
        double toan = sc.nextDouble();
        System.out.println("Nhap vao diem ly:");
        double ly = sc.nextDouble();
        System.out.println("Nhap vao diem hoa:");
        double hoa = sc.nextDouble();

        if (toan > 10 || toan < 0 || ly > 10 || ly < 0 || hoa > 10 || ly < 0) {
            sc.close();
            return;
        }
        double trungBinh = (toan * 2 + ly + hoa) / 4;
        System.out.printf("Trung binh la: %.2f", trungBinh);
        if (trungBinh >= 8) {
            System.out.println("Hoc sinh gioi");
        } else if (trungBinh >= 6.5) {
            System.out.println("Hoc sinh kha");
        } else if (trungBinh >= 5) {
            System.out.println("Hoc sinh trung binh");
        } else {
            System.out.println("Hoc sinh yeu");
        }
        sc.close();
    }
}
