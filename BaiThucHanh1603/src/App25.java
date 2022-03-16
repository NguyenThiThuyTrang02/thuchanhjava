import java.util.Scanner;
import shapes.hinhChuNhat;
import shapes.hinhTron;
public class App25 {
    public static void  main(String args[]){
        hinhTron ht = new hinhTron();
        hinhChuNhat hcn = new hinhChuNhat();
        ht.NhapBanKinh();
        ht.InBanKinh();
        ht.TinhChuVi();
        ht.InChuVi();
        ht.TinhDienTich();
        ht.InDienTich();
        hcn.NhapChieuDai();
        hcn.NhapChieuRong();
        hcn.tinhChuVi();
        hcn.inChuVi();
        hcn.tinhDienTich();
        hcn.inDienTich();
    }
}
