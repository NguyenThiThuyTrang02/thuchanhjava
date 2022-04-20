package QuanlySV;

public class OnlineStudent extends Student {
    public String maSV;
    public void nhapMSV(){
        System.out.print("Nhap ma sinh vien:");
        maSV=scan.nextLine();
    }
    public void inThongTinSVO(){
        System.out.println("Ten: "+ten);
        System.out.println("Ma sinh vien: "+maSV);
    }
}
