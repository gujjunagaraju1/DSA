package stack;

public class InfToPre {
    public static void main(String[] args) {
        String input="a*(b+c)/d";
        String value="";
        StringBuilder builder=new StringBuilder(input);
        String reversed=builder.reverse().toString();
        System.out.println(reversed);
        //Chat gpt for reverse and parameter changes

//        for (int i = input.length() - 1; i >= 0; i--) {
//            char ch = input.charAt(i);
//            if (ch == '(') builder.append(')');
//            else if (ch == ')') builder.append('(');
//            else builder.append(ch);
//        }

        for(int i=0;i<reversed.length();i++){
            if(reversed.charAt(i)=='('){
                value+=')';
            }
            else if(reversed.charAt(i)==')'){
                value+='(';
            }
            else{
                value+=reversed.charAt(i);
            }
        }
        System.out.println(value);
        String reversedPrefix=InfToPost.output(value);
        String prefix=new StringBuilder(reversedPrefix).reverse().toString();
        System.out.println(prefix);


    }
}
