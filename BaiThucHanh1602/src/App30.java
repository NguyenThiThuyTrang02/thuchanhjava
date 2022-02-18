import java.util.Scanner;
/* tổng một số nhập vào*/
public class App30 {
    public static void main(String[] args) throws Exception {
        int n, sodu, tong=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap mot so:");
        n = sc.nextInt();
        while(n>0){
            sodu = n%10;
            n = n/10;
        tong += sodu;
        }
        System.out.println(" Tong cac so vua nhap la:"+tong);
    }
}