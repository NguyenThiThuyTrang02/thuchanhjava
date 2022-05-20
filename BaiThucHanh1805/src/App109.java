import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App109{
    public static void main (String [] args){
        int so, max;
        int deleteNumber;
        ArrayList<Integer> number = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu: ");
        int sophantu = sc.nextInt();
        
        for(int i=0;i<sophantu;i++){
            System.out.print("So phan tu thu "+i+" la: ");
            so=sc.nextInt();
            number.add(so);
        }
        System.out.println(" cac phan tu vua nhap la: ");
        System.out.println(number);

        // tim so co gia tri lon nhat
        ArrayList<Integer> number0 = new ArrayList<>();
        number0.addAll(number);
        max=number.get(0);
        for(int i=0;i<number0.size();i++){
            if(number.get(i).compareTo(max)>0){
                max=number0.get(i);
            }
        }
        System.out.println("------ \nPhan tu lon nhat la: "+max);

        // nhap vao mot so. xoa khoi mang phan tu vua nhap
        System.out.print("------\nNhap so phan tu muon xoa la: ");
        ArrayList<Integer> number2= new ArrayList<>();
        deleteNumber = sc.nextInt();
        number2.add(deleteNumber);
        // xoa phan tu
        number.removeAll(number2);
        System.out.println(" Cac phan tu con lai cua mang:"+number);

        // sap xep day so va in ra man hinh
        number.sort(Comparator.naturalOrder());
        System.out.println("Sau khi sap xep tang dan: ");
        for(int i=0; i<number.size();i++){
            System.out.println(number.get(i)+"\t");
        }
    }
}