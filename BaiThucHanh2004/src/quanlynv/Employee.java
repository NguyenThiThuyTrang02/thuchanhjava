package quanlynv;
import QuanlySV.Person;
public class Employee extends Person {
    public String maNV;
    public void nhapMaNV(){
        System.out.print("Nhap ma nhan vien:");
        maNV=scan.nextLine(); 
    }
}
