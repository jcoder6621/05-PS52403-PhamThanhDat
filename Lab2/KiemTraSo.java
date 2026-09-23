import java.util.Scanner;

public class KiemTraSo {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so:");
        int num = sc.nextInt();
        // Num la so chan hay le
        if (num % 2 == 0) {
            System.out.println(num + " la so chan");
        } else {
            System.out.println(num + " la so le");
        }
        // Num la so am hay duong
        if (num > 0) {
            System.out.println(num + " la so duong");
        } else if (num < 0) {
            System.out.println(num + " la so am");
        } else {
            System.out.println(num + "khong la la so am va so duong");
        }
        sc.close();
    }

}
