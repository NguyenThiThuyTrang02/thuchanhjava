import java.util.Scanner;
public class App44 {
    
    private final float PI=3.14f;
    private float banKinh;

    // constructor

    private void nhapBanKinh(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh=sc.nextFloat();
    }
    private float tinhCV(){
        return 2*PI*banKinh;
    }
    private float tinhDienTich(){
        return PI*banKinh*banKinh;
    }
}
class HinhTron{
    public static void main (String []args){
        App44 ht=new App44();
        ht.nhapBanKinh();
        ht.tinhDienTich();
        ht.tinhCV();

    }
}
