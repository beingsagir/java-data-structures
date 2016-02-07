package mergesort;

import java.util.ArrayList;

/**
 * Created by Sagir on 2/7/2016.
 */
public class MergeSortOperations {

    ArrayList<Integer> finalResult = new ArrayList<>();

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        if((a.size() == 1) && (b.size() == 1)){
            return (sort(a, b));
        }else {
            ArrayList<Integer> aNewA = (ArrayList<Integer>) a.subList(0, (a.size()/2));
            ArrayList<Integer> aNewB = (ArrayList<Integer>) a.subList(((a.size()/2)+1), (a.size()));
            ArrayList<Integer> bNewA = (ArrayList<Integer>) b.subList(0, (a.size()/2));
            ArrayList<Integer> bNewB = (ArrayList<Integer>) b.subList(((a.size()/2)+1), (a.size()));
            finalResult = sort(merge(aNewA, aNewB), merge(bNewA, bNewB));
        }
        return finalResult;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> a, ArrayList<Integer> b){

        ArrayList<Integer> sortted = null;
        a.forEach(content->{
            int i = 0;
            if(content<b.get(i)){
                sortted.add(content);
            }else if (content>b.get(i)){
                sortted.add(b.get(i));
            }else{
                i++;
            }
        });
        return sortted;
    }

}
