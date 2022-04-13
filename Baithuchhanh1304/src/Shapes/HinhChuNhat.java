package Shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float chieuDai;
    public float chieuRong;
   public HinhChuNhat(){
        ten="Hinh Chu Nhat";
    }
    public void nhapChieuDai(){
        System.out.print("Nhap chieu dai: ");
        Scanner sc= new Scanner(System.in);
        chieuDai=sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("Nhap chieu rong: ");
        Scanner sc= new Scanner(System.in);
        chieuRong=sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi=2*(chieuDai+chieuRong);
    }
    public void tinhDienTich(){
        dienTich=chieuDai*chieuRong;
    }
    
}
