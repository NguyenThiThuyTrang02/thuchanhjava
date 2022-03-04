import java.util.Scanner;
public class App1{
    public static void main(String[] args){
        // Tinh tổng hiệu tích thương chia lấy dư của hai số
        double n, m, tong, hieu,tich, thuong, du;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao hai so thu 1: ");
        n=sc.nextDouble();
        System.out.print("Nhap vao hai so thu 2: ");
        m=sc.nextDouble();
        tong=n+m;
        System.out.println(" Tong "+n+" + "+m+" = "+tong);
        hieu=n-m;
        System.out.println(" Hieu "+n+" - "+m+" = "+hieu);
        tich=n*m;
        System.out.println(" Tich "+n+" x "+m+" = "+tich);
        thuong=n%m;
        System.out.println(" Thuong "+n+" : "+m+" = "+thuong);
        du=n/m;
        System.out.println(" Du cua "+n+" va "+m+" la: "+du);
        //so sánh hai số đó
        if(n>m) System.out.println(n +" lớn hơn "+ m);
        else if(n<m) System.out.println(n +" nhỏ hơn "+ m);
        else System.out.println(n +" bằng "+ m);
    }
}




