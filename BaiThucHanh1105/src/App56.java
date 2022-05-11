import java.util.Scanner;
import java.util.HashSet;

public class App56 {
    public static void main(String[]args){
        String name;
        Scanner sc= new Scanner(System.in);
        HashSet<String> hashsetstring= new HashSet<>();       
            hashsetstring.add("wilson");
            hashsetstring.add("nike");
            hashsetstring.add("volvo");
            hashsetstring.add("kis");
            hashsetstring.add("lenovo");
            hashsetstring.add("lenovo"); 
            
            System.out.println("Cac phan tu trong hashsetstring la ");
            System.out.println(hashsetstring);
            System.out.print(" nhap phan tu can xoa");
            name = sc.nextLine();

            if(hashsetstring.contains(name)){
                hashsetstring.remove(name);
                System.out.println("Xoa thanh cong");
                System.out.println(" cac phan tu con lai la:");
                System.out.println(hashsetstring);
            } else{
                System.out.println("xoa thanh cong");
            }
    }
}
