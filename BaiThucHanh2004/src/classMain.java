import QuanlySV.OfflineStudent;
import QuanlySV.OnlineStudent;
import QuanlySV.Student;
import quanlynv.FullTimeEmpoyee;
import quanlynv.PartTimeEmployee;
public class classMain {
    public static void main(String[]args){
        Student hs = new Student();
        hs.nhapTen();
        hs.nhapĐiaChi();
        hs.nhaplop();
        hs.inThongTin();
        OnlineStudent ohs= new OnlineStudent();
        ohs.nhapTen();
        ohs.nhapĐiaChi();
        ohs.nhaplop();
        ohs.nhapMSV();
        ohs.inThongTinSVO();
        OfflineStudent ofhs= new OfflineStudent();
        ofhs.nhapSiSo();
        ofhs.inSS();
        FullTimeEmpoyee ft= new FullTimeEmpoyee();
        ft.nhapMaNV();
        ft.CV();
        PartTimeEmployee pt= new PartTimeEmployee();
        pt.nhapMaNV();
        pt.thongBao();
    }
}
