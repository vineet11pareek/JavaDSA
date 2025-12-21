package leetcode;

import java.util.*;


/*
20: Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
    Input: s = "()"
    Output: true

Example 2:
    Input: s = "()[]{}"
    Output: true

Example 3:
    Input: s = "(]"
    Output: false

Example 4:
    Input: s = "([])"
    Output: true

Example 5:
    Input: s = "([)]"
    Output: false

 */
public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("([)]"));

    }
    public static boolean isValid(String s){
        Deque<Character> charStack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            switch(c){
                case '(' -> charStack.push(')');
                case '[' -> charStack.push(']');
                case '{' -> charStack.push('}');
                default -> {
                    if(charStack.isEmpty() || charStack.pop()!=c)
                        return false;
                }
            }

        }
        return charStack.isEmpty();
    }
}


