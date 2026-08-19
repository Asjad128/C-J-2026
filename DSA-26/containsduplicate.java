
import java.util.HashSet;
import java.util.Set;

public class containsduplicate{

    static boolean duplicates(int[] arr){

        Set<Integer> list = new HashSet <>();
        for (int i: arr){
            if (list.contains(i)){
                return true;
            }
            list.add(i);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={1,2,3,4,5,1};
        
        System.out.println(duplicates(arr));
        System.out.println(duplicates(arr2));
    }
}

