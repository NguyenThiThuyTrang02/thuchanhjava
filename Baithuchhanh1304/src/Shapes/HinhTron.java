package Shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc{
   
    public float banKinh;
    public HinhTron(){
        ten = "Hinh Tron";
    }
    public void nhapBanKinh(){
        System.out.print("Nhap ban kinh :");
        Scanner sc= new Scanner(System.in);
        banKinh = sc.nextFloat();
    }
    public void tinhChuvi(){
        chuVi= 2*PI*banKinh;
    }
    public void tinhDienTich(){
        dienTich=PI*banKinh*banKinh;
    }
}

