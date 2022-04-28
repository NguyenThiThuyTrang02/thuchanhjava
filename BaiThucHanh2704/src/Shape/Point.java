package Shape;

import java.util.Scanner;

public class Point {
    private String tendiem;
    private float hoanhdo, tungdo;

    //getter của thuộc tính tên điểm
    public String gettenDiem(){
        return tendiem;
    }

    //setter của thuộc tính điểm
    public void setenDiem(String diem){
        this.tendiem=diem;
    }

    //getter của thuộc tính hoanh do
    public float getHoanhDo(){
        return hoanhdo;
    }

    //setter cua thuoc tinh hoanh do
    public void setHoanhDo(float hoanh){
        this.hoanhdo=hoanh;
    }

    //getter cua thuoc tinh tung do
    public float getTungdo(){
        return tungdo;
    }
    public void setTungDo(float tung){
        this.tungdo=tung;
    }
    public Point(){};//để k cần truyền tham số vào cho khai báo đối tượng Point ở hàm main.
    public Point (String diem, float hoanh, float tung){
        this.tendiem=diem;
        this.hoanhdo=hoanh;
        this.tungdo=tung;
    }

    // nhap
    public void nhapDiem(){
        Scanner nd= new Scanner(System.in);
        System.out.println("Nhap ten diem: ");
        tendiem = nd.nextLine();
        System.out.println("Nhap hoanh do: ");
        hoanhdo= nd.nextFloat();
        System.out.println("Nhap tung do: ");
        tungdo=nd.nextFloat();
    }

    public void inThongTin(){
        System.out.println(tendiem+"("+hoanhdo+","+tungdo+")");
    }

}
