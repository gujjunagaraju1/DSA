package Recursion.Easy;

public class reverse {
    public static void main(String[] args) {
        String a="abc";

        System.out.println(reversing (a.split(""),0,a.length()-1));

    }
    public static String reversing(String a[], int l, int r) {
        if(l>=r){
          String m=  String.join("",a);
            return m;
        }
        else{
            String m=a[l];
            a[l]=a[r];
            a[r]=m;
           return reversing(a,l+1,r-1);

        }

    }
}
