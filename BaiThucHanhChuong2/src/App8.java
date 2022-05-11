import java.util.Scanner;
// nhập vao số nguyên,in ra trung bình cộng của các só đó
public class App8 {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen: ");
            number = sc.nextInt();
        }while (number <= 0);
        int a[] = new int[number];
        float sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("a[" + i + "]=");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        float average = sum / number;
        System.out.println("Trung binh cong = " + average);
    }
} 