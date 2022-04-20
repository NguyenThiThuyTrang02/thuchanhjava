package QuanlySV;

public class OfflineStudent extends Student{
    public int siso;
    public void nhapSiSo(){
        System.out.print("Si So:");
        siso = scan.nextInt();
    }
    public void inSS(){
        System.out.print( "Si So = "+siso);
    }
}
