package QuanlySV;

public class Student extends Person {
    public String lop;
    public void nhaplop(){
        System.out.print("Ten lop: ");
        lop=scan.nextLine();
    }
    public void inThongTin(){
        System.out.print("\n\nThong tin hoc sinh\n\n");
        System.out.println(" Ho va ten: "+ten);
        System.out.println("Dia chi: "+diachi);
        System.out.println("Lop: "+lop);
    }
}
