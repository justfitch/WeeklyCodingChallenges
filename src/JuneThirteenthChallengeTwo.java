import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JuneThirteenthChallengeTwo {

    public static void main(String[] args) {
        //Input Dummy Data into an Array of LinkedLists
        List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,4,5));
        List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,3,4));
        List<Integer> list3= new LinkedList<Integer>(Arrays.asList(2,6));

        List<Integer>[] lists = new LinkedList[3];

        lists[0] = list1;
        lists[1] = list2;
        lists[2] = list3;

        //Create a new LinkedList and insert all numbers from the array
        List<Integer> compiled = new LinkedList<>();

        for(List<Integer> list : lists)
            for(Integer num : list)
                compiled.add(num);

        //Use the Collections method sort() to sort the list
        Collections.sort(compiled);

        //Output Result
        System.out.println(compiled);

    }

}
