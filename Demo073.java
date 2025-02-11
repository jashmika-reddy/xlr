import java.util.HashSet;
public class Demo073 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1}; 
        HashSet<Integer> seen = new HashSet<>(); 
        HashSet<Integer> duplicates = new HashSet<>(); 
        for (int num : arr) {
            if (!seen.add(num)) { 
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}
