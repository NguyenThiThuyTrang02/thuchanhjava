package Main;
import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;
public class App54 {
    public static void main(String[] args){
        HinhTron ht= new HinhTron();
        HinhTru hinhTru=new HinhTru();
        HinhChuNhat hcn= new HinhChuNhat();
        HinhVuong hv=new HinhVuong();
        // nhap cho hinh tron.
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuvi();
        ht.inChuVi();
        ht.tinhDienTich();
        ht.inDienTich();
        // nhap cho hinh tru
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();
        // hinh chu nhat
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.inChuVi();
        hcn.tinhDienTich();
        hcn.inDienTich();
        // hinh vuong
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.inChuVi();
        hv.tinhDienTich();
        hv.inDienTich();
    }
}
