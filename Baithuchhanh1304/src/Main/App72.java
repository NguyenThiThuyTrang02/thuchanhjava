package Main;

import getandset.sinhVien;

public class App72 {
    public static void main(String[]args){
        sinhVien sv1= new sinhVien();
        sinhVien sv2= new sinhVien();
    }
    // set thông tin vào cho các sinh viên
    sv1.setten("");
    sv1.setTuoi(23);
    sv2.setTen("ngoc");
    sv2.setTuoi(20);

    System.out.print("Sinh vien 1 co ten:"+sv1.getTen()+", tuoi: "+sv1.getTuoi());
    System.out.print("Sinh vien 2 co ten:"+sv2.getTen()+", tuoi: "+sv2.getTuoi());
}

