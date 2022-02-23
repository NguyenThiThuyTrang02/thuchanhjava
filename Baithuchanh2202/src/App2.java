import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception{
        float a, b, c, S=0;
        Scanner scan = new Scanner(System.in);
        System.out.print(" Nhap vao canh A: ");
        a = scan.nextFloat();
        System.out.print(" Nhap vao canh B: ");
        b = scan.nextFloat();
        System.out.print(" Nhap vao canh C: ");
        c = scan.nextFloat();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Day la tam giac !");
		}
		if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Day la tam giac can!");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Day la tam giac deu !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Day la tam giac vuong !");
		} else {
			System.out.println("Day khong phai la tam giac");
		}
    }
}
