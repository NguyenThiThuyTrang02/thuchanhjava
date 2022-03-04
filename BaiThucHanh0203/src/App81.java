import java.util.Scanner;
public class App81{
    // Nhập phần tử cho ma trận hai chiều, tìm và hiển thị giá trị lớn nhất
    public static void main(String[] args) {
        // nhập số lương phần tử n và m.
        int m,n;
        Scanner sc= new Scanner (System.in);
        do{
            System.out.print(" Nhap vao so hang : ");
            n= sc.nextInt();
            System.out.print(" Nhap vao so cot : ");
            m= sc.nextInt();
        }while(n<0);
        // khai báo array
       int[][] A = new int [n][m];  
        System.out.println(" Nhap phan tu cho ma tran");
        // nhập phần tử cho ma trận
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){     
                System.out.print("A[ "+i+" ] [ "+j+ " ] = ");               
                A[i][j]= sc.nextInt();
            }
        }
        
        int max=A[0][0];
        for(int i = 0;i<n;i++){
            for(int j = 0; j<m;j++){
                if(max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.print(" Gia tri Max cua ma tran A la :"+max);

    }
}