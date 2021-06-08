package Stack;
import java.util.*;
/*
    1. You are given a string exp representing an expression.
    2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
    3. But, some of the pair of brackets maybe extra/needless.
    4. You are required to print true if you detect extra brackets and false otherwise.
 */

public class DuplicateBracket {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(stack.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(stack.peek() != '('){
                        stack.pop();
                    }
                    stack.pop();

                }
            }
            else{
                stack.push(ch);
            }
        }
        System.out.println(false);
    }
}
