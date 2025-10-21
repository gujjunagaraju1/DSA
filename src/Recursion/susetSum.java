package Recursion;

import javax.print.DocFlavor;

public class susetSum {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,11};
        int target=11;
        System.out.println(subsetTarget(arr,0,target)?"yes":"No");

    }
    public static boolean subsetTarget(int[] arr, int index, int target) {
        if(target==0){
            return true;
        }
        if(index==arr.length){
            return false;
        }
        if(arr[index]<=target){
          if(subsetTarget(arr,index+1,target-arr[index])){
              return true;
          };
        }
        return subsetTarget(arr,index+1,target);
    }
}
