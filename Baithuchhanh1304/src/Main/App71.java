package Main;

import getandset.toado;
import getandset.hinhTron;
public class App71 {
    public static void main(String[]args){
        hinhTron ht=new hinhTron();
        ht.setBanKinh(15);
        float chuVi=ht.tinhChuVi();
        float dienTich= ht.tinhDienTich();
        System.out.println("Chu vi ="+chuVi+"Dien tich = "+dienTich);
    }
}
