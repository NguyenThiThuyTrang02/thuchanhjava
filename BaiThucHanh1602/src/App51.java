import java.util.Scanner;
public class App51 {
    // viết chương trình in ra màn hình các số nhỏ hơn 5
    public static void main(String[]args) throws Exception{
        int n;
        System.out.print("Nhap so:");
        Scanner sc= new Scanner( System.in);
        n = sc.nextInt();
        for(n=0;n<5;n++)
        {System.out.print(" Cac so nho hon 5 la:" +n);}
    }
}
