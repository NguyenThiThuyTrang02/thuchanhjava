import java.util.Scanner;
 public class hinhtron {
    
        final float PI = 3.14f;
        float r,cv,dt;
        void nhapBanKinh(){
            System.out.print("Nhap ban kinh:");
            Scanner sc= new Scanner(System.in);
            r = sc.nextFloat();
        }
        float chuVi(){
            cv=2*PI*r;
            //in chu vi luôn.
            return cv;
        }
       
        void DienTich(){
            dt=PI*r*r;
        }
        // in diện tích
        void inDienTich(){
            System.out.println(" \nDien tich hinh tron la:" +dt);
        }
        void inChuVi(){
            System.out.print(" Chu vi la:"+cv);
        }
     }

