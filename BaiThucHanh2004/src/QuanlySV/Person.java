package QuanlySV;
import java.util.Scanner;
public class Person {
    public String ten,diachi;
    public Scanner scan=new Scanner(System.in);
    public void nhapTen(){
        System.out.print("Nhap ho va ten: ");
        ten=scan.nextLine();
    }
    public void nhapĐiaChi(){
        System.out.print("Nhap Dia Chi: ");
        diachi=scan.nextLine();
    }
}
