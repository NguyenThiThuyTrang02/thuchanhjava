import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception{
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap vao so nguyen duong A: ");
        a = sc.nextInt();
        System.out.print(" Nhap vao so nguyen duong b: ");
        b = sc.nextInt();
        System.out.println("USCLN cua " + a + " va " + b
                + " la: " + USCLN(a, b));
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    } 
    }


