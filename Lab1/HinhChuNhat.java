import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao chieu dai");
        int chieudai = sc.nextInt();

        System.out.println("Nhap vao chieu rong");
        int chieurong = sc.nextInt();

        int chuvi = (chieudai + chieurong) *2;
        int dientich = chieudai *chieurong;

        System.out.println("Chu vi hinh chu nhat la:" + chuvi);
        System.out.println("Dien tich hinh chu nhat la:" + dientich);
        sc.close();
    }
}