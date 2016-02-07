package mergesort;

import java.util.ArrayList;

/**
 * Created by Sagir on 2/7/2016.
 */
public class MergeSortTest {

    public static void main(String args[]){
        MergeSortOperations mergeSortOperations = new MergeSortOperations();
        ArrayList<Integer> input1= null;
        input1.add(6);
        input1.add(2);
        input1.add(3);
        input1.add(5);
        ArrayList<Integer> input2= null;
        input2.add(4);
        input2.add(5);
        input2.add(7);
        input2.add(7);
        input2.add(2);
        ArrayList<Integer> result = mergeSortOperations.merge(input1, input1);
        result.forEach(data-> System.out.println("data = " + data));
    }
}
