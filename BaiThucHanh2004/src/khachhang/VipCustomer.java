package khachhang;
import QuanlySV.Person;
public class VipCustomer extends Person {
      void ht(){
        System.out.print("Khach Vip");
    }
    public static void main(String[]args){
        Customer vip = new Customer();
        vip.nhapTen();
        vip.gioiTinh();
    }
}

