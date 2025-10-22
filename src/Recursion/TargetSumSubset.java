package Recursion;

import java.util.ArrayList;
import java.util.List;

public class TargetSumSubset {
    public static void main(String[] args) {
        int arr[]={2,3,5,8,11};
        int target=11;
        List<List<Integer>> output=new ArrayList<>();
        List<Integer> value=new ArrayList<>();
        subsetTarget(arr,target,value,output,0);
        System.out.println(output);

    }
   public static void subsetTarget(int[] arr,int target,List<Integer> value,List<List<Integer>> output,int index){
       if(target==0){
           output.add(new ArrayList<>(value));
           return;
       }
       if (index==arr.length || target<0){
           return;
       }
       value.add(arr[index]);
       subsetTarget(arr,target-arr[index],value,output,index+1);
       value.remove(value.size()-1);
       subsetTarget(arr,target,value,output,index+1);


   }

}
