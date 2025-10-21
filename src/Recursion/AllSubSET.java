package Recursion;
import java.util.*;

public class AllSubSET {
    public static void main(String[] args) {
        String a="ab";
        ArrayList<String> value=new ArrayList<>();
        String m="";
        subset(a,value,m,0);
        System.out.println(value);
    }
    public static void subset(String a,ArrayList<String> value,String m,int index){
        if(index==a.length()){
            value.add(m);
            return;
        }
        subset(a,value,m+a.charAt(index),index+1);
        subset(a,value,m,index+1);


    }
}
