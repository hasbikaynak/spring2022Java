package question_bank2;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        /*Write a Java program to find all the unique triplets such that sum of all the three elements [x,y,z(x<=y<=z)] equal to a specified number.
        * Sample Array: [1,-2,0,5,-1,-4] ==> -4,1,5
        * target value: 2
        */
        int[] arr = {1, -2, 0, 5, -1, -4};
        int target = 2;
        Q05 r = new Q05();
        System.out.println(r.threeSum(arr,target));
    }
    public List<List<Integer>> threeSum(int[] arr, int target) {
        List<List<Integer>> myList = new ArrayList<List<Integer>>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (i != j && j != k && i != k && (arr[i] + arr[j] + arr[k] == target)) {
                        List<Integer> innerList = new ArrayList<Integer>(3);
                        innerList.add(arr[i]);
                        innerList.add(arr[j]);
                        innerList.add(arr[k]);
                        myList.add(innerList);
                    }
                }
            }
        }
        return myList;
    }
}
