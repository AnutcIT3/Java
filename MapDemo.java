import java.util.HashMap;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        HashMap<String, Integer> map2 = new HashMap<>();
        String[] words = s.split(" ");
        for(String  c : words){
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }
            else{
                map2.put(c,1);
            }
        }
        System.out.println(map2);
        sc.close();
    }
}