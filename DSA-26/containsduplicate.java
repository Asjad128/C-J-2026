import java.util.HashSet;
import java.util.Set;

public class containsduplicate{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int check=0;
        Set<Integer> set= new HashSet<>();
        for (int i: arr){
            if (set.contains(i)){check+=1;}
            set.add(i);
        }
        if (check==0){
            System.out.println(false);
        }
        else{
            System.out.println(true); 
        }
    }
}

