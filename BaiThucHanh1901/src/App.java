import java.util.Scanner;
public class App{
    public static void main( String[] args) throws Exception{
        double hesoA, hesoB, hesoC, nghiemX, nghiemY, delta;
        System.out.println("Nhap so A:");
        Scanner sc= new Scanner(System.in);
        hesoA = sc.nextDouble();
        System.out.println("Nhap so B:");
        hesoB = sc.nextDouble();
        System.out.println("Nhap so C:");
        hesoC = sc.nextDouble();
        delta = hesoB * hesoB - 4 * hesoA * hesoC;
        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta == 0){
            nghiemX = -hesoB / (2*hesoA);
            System.out.println(" Phuong trinh co nghiem la:" +nghiemX);
        }
        else{
            nghiemX = (-hesoB + Math.sqrt(delta)) / (2*hesoA);
            nghiemY = (-hesoB - Math.sqrt(delta)) / (2*hesoA);
            System.out.println("Phuong trinh co hai nghiem la X1="+nghiemX +"X2="+nghiemY);
        }
        sc.close();
        }   
     }

