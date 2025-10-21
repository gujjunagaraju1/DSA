package stack;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};

        int m=0;
        int k[]=new int[arr.length*2];
        int[] doubled = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            doubled[i] = arr[i];
            doubled[i + arr.length] = arr[i]; // copy again
        }
        Stack<Integer> value=new Stack<>();
        Stack<Integer> output=new Stack<>();
       for(int i=0;i<doubled.length;i++) {
           if (value.isEmpty() || doubled[i] < doubled[value.peek()]) {


               value.push(doubled[i]); //1
           } else {
               while (!(value.isEmpty()) && doubled[i] > value.peek()) {
                   m=doubled[i];

                   value.pop();

               }
               value.push(doubled[i]);
           }
       }
        System.out.println(output.size());


       for(int i=output.size();i<arr.length;i++) {
           if(arr[i]==m){
               output.push(-1);
           }
           else{
               output.push(m);
           }
       }
        System.out.println(output);
    }
}
