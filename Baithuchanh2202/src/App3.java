import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception{
            int n, dem=0;
            Scanner sc=new Scanner(System.in);
            System.out.print("nhap vao so nguyen can kiem tra: ");
            n=sc.nextInt();
            for (int i=1;i<=n;i++){
                    if(n%i==0){
                        dem++;
                        }
                     }
                if(dem==2){
                    System.out.print( n+" la so nguyen to.");
                }
                else 
                    System.out.println(n+" khong la so nguyen to!");  
            }
        }

