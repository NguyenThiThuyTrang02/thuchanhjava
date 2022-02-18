import java.util.Scanner;
public class App47 {
/* chương trình nhập vào số nguyên,tính tổng các số đó và báo nếu tổng lớp hơn 100 và kết thúc */
    public static void main(String[]args)throws Exception{
        int n, tong=0;
        Scanner so = new Scanner(System.in);
        do{
            System.out.print("Nhap so:");
            n = so.nextInt();
           tong += n;
        }while(tong<100);
        System.out.print(" Tong so vua nhap la: " +tong);
    }
}