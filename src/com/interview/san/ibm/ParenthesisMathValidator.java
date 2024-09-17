package com.interview.san.ibm;

import java.util.Stack;
/*Program to validate a string with multiple parentheses mathematically*/
public class ParenthesisMathValidator {
    public static void main(String[] args) {
        String s = "{[{()}{}][]}";//"(]";//{[{()}{}][]}"; {a+b}[a*b](/n)
        System.out.println(s + " : " + validate(s));
    }
    private static boolean validate(String s) {
        Stack<Character> paranthesisStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                paranthesisStack.push(c);
            }
            else if(c == '}' || c == ')' || c == ']'){
                if(paranthesisStack.isEmpty())
                    return false;
                char top = paranthesisStack.pop();
                if((top == '{' && c != '}') ||
                        (top == '(' && c != ')') ||
                        (top == '[' && c != ']')){
                    return false;
                }
            }
        }
        return paranthesisStack.isEmpty();
    }
}
