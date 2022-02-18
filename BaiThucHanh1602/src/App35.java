import java.util.Scanner;
/* nhập vào hai số và in ra số nhỏ nhất trong hai số */
public class App35 {  
    public static void main(String[] args) throws Exception {
      int soA, soB, min;
       Scanner scanner= new Scanner(System.in);
       System.out.print("Nhap vao so thu nhat:");
       soA= scanner.nextInt();
       System.out.print("Nhap vao so thu hai:");
       soB= scanner.nextInt();
       min = soA;
       if(soA>soB)
        min= soB;
           System.out.print("So nho nhat trong hai so " +soA + " va " +soB+ " la: "+ min);  
       }
    }

