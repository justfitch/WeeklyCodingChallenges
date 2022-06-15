import java.util.ArrayList;
import java.util.List;

public class JuneThirteenthChallengeOne {

    public static void main(String[] args) {
        // Insert Dummy Data
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};

        //Create a new list
        List<Integer> fullSet = new ArrayList<>();

        //Populate list with all dummy data
        for(int num : nums1){
            fullSet.add(num);
        }

        for(int num : nums2){
            fullSet.add(num);
        }

        //Convert all numbers in the list to double type and find the median (average)
        double median = fullSet.stream().mapToDouble(n->n).average().orElse(0.0);

        //Output Result
        System.out.println(median);
    }

}
