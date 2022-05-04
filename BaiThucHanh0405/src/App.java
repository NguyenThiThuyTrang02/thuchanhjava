import java.util.ArrayList;
import java.util.Iterator;
public class App {
    public static void main(String[] args) throws Exception {
       
        ArrayList<String> arr = new ArrayList<>();
        arr.add("JAVA");
        arr.add("PHP");
        arr.add("C#"); 
        arr.add(1,"C++");
        System.out.println(" cac phan tu trong arr");
        for(int i =0; i< arr.size(); i++){
            System.out.println(arr.get(i)+"\t");
        }
        Iterator<String> iterator = arr.iterator();
        System.out.println("Cac phan tu co trong arr la ");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
}
