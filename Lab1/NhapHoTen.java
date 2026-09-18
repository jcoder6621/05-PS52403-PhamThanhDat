import java.util.Scanner;

public class NhapHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ho va ten");
        String name = sc.nextLine();

        System.out.println("Nhap vao nam sinh");
        int birthYear = sc.nextInt();

        int age = 2026 - birthYear;

        System.out.println("Ho va ten:"+name+"\n Tuoi:"+age);
        sc.close();
    }
}
