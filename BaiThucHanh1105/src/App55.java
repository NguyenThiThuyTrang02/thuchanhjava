import java.util.HashSet;
import java.util.Scanner;

public class App55{
    public static void main(String[]args){
        int number;
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(0);
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        hashset.add(8);
        System.out.print("Cac phan tu trong hashset:");
        System.out.println(hashset);
        System.out.print("Nhap phan tu can them ");
        number = sc.nextInt();
        
        if (!hashset.contains(number)){
            hashset.add(number);
            System.out.println(" Them thanh cong");
            System.out.println("Cac phan tu trong hashset sau khi them la:");
            System.out.println(hashset);
        } else{
            System.out.println("phan tu "+number+" da ton tai!");
        }
    }
}