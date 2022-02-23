import java.util.Scanner;
public class App4 {
    public static void main(String[] args) throws Exception{
        int n, dem=0;
        Scanner s=new Scanner(System.in);
        do{
        System.out.print("Nhap vao mot so nguyen duong:");
        n=s.nextInt();
        }while(n<0);
        for (int i=1;i<n;i++){
            if(n%i==0){
                dem++;
                }
            }
                if(dem==2){
                System.out.print("cac so nguyen to nho hon "+ n +" la: " + dem);
                }
                else{
                    System.out.print(n+" khong phai la so nguye to");
                }          
    }
}
