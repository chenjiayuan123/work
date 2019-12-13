package random;

import java.util.*;

public class random {

    public static void main(String[] args) {
        Random r = new Random();

        HashSet<Integer> hs = new HashSet<>();

        while (hs.size()<10){
            int num = r.nextInt(20)+1;
            hs.add(num);
        }
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
