import java.util.Scanner;

public class MuaTrongNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang vao");
        int thang = sc.nextInt();

        switch (thang) {
            case 1, 2, 3 -> System.out.println("Mua xuan");
            case 4, 5, 6 -> System.out.println("Mua ha");
            case 7, 8, 9 -> System.out.println("Mua thu");
            case 10, 11, 12 -> System.out.println("Mua dong");
            default -> System.out.println("Khong hop le");
        }

        sc.close();
    }
}
