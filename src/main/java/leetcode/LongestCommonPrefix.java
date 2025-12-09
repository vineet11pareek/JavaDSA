package leetcode;

/*
Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};

        longestCommonPrefix(strs1);

        longestCommonPrefix2(strs1);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix2(String[] strs) {
        // Guard clause with pattern matching
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Using var and enhanced for
        var first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // Using logical operators for concise condition
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}


