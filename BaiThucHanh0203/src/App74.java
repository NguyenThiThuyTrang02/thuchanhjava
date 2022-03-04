// Tổng các số chẵn cho mang vừa nhập
import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        // nhập vào só phần tử của mạng
        int n;
            Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Nhap vao so phan tu cua mang");
            n=sc.nextInt();
        }while (n<0);
        // nhập các phàn tử cho mảng
        int A[] = new int[n];
        System.out.println("Nhap phan tu cho mang");
            //vòng lặp for để giới hạn n -> số phần tử
        for (int i=0; i<n;i++){
            System.out.print("nhap phan tu thu "+i+" :");
            // khai báo mảng
            A[i]= sc.nextInt();
        }
        // Tinh tong cac so chăn trong mảng
        double Tong =0;
        for(int i=0;i<n;i++)
        if(A[i]%2==0){
            Tong+=A[i];
        }
        System.out.println(" Tong cac so chan trong mang vua nhap la :"+ Tong);
    }
}

