package Stack;
import java.util.*;
/*
    1. You are given a string exp representing an expression.
    2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

    e.g.
    [(a + b) + {(c + d) * (e / f)}] -> true
    [(a + b) + {(c + d) * (e / f)]} -> false
    [(a + b) + {(c + d) * (e / f)} -> false
    ([(a + b) + {(c + d) * (e / f)}] -> false
 */

public class BalanceBracket {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val =  handleClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val =  handleClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val =  handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }

            } else {

            }

        }
        if(st.size() == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);

        }
    }
        public static boolean handleClosing(Stack<Character> st,char corroschar){
            if(st.size() == 0){
                return false;

            }
            else if(st.peek() != corroschar){
                return false;
            }
            else{
                st.pop();
                return true;
            }
        }

}
