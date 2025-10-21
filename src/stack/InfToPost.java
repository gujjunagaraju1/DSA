package stack;

import java.util.Stack;

public class InfToPost {
    public static void main(String[] args) {
        String input="a^b^c";
        System.out.println(output(input));

    }
    public static String output(String input){
        StringBuilder stringBuilder=new StringBuilder();
        Stack<Character> Operands=new Stack<>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c=='('){
                Operands.push(c);
                continue;
            }
            if(c==')'){
                while(!Operands.empty() && !(Operands.peek()=='(')){
                    stringBuilder.append(Operands.pop());
                }
                Operands.pop();
                continue;

            }
            if(!operator(c)){
                stringBuilder.append(c);
            }
            else{

                if (Operands.empty()) {
                    Operands.push(c);
                } else if (precedent(Operands.peek())<precedent(c)) {
                    Operands.push(c);
                }
                else{
                    while(!Operands.empty() && precedent(Operands.peek())>precedent(c)){
                        stringBuilder.append(Operands.pop());

                    }
                    Operands.push(c);
                }

            }

        }
        while(!Operands.empty()){
            stringBuilder.append(Operands.pop());
        }
        return stringBuilder.toString();
    }
    private static int precedent(char c){
        switch  (c){
            case '^':
                return 3;
            case '*' :
            case '/':
                return 2;
            case '+':
                case '-':
                    return 1;
            default:
                return 0;

        }


    }
    private static boolean operator(char m){
        return (m=='^' || m=='*' || m=='/' || m=='+' || m=='-')?true:false;

    }
}
