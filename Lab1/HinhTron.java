import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ban kinh:");
        double bankinh = sc.nextDouble();

        double chuvi = 2 * pi * bankinh;
        double dientich = pi * bankinh * bankinh;

        System.out.printf("Chu vi: %.2f", chuvi);
        System.out.printf("Dien tich: %.2f", dientich);

        sc.close();
    }
}
