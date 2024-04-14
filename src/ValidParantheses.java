// Problem Description
//Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses
// of length 2*A.
//
//
//
//Problem Constraints
//1 <= A <= 10
//
//
//
//Input Format
//First and only argument is integer A.
//
//
//
//Output Format
//Return a sorted list of all possible parenthesis.
//
//
//
//Example Input
//Input 1:
//
//A = 3
//Input 2:
//
//A = 1
//
//
//Example Output
//Output 1:
//
//[ "((()))", "(()())", "(())()", "()(())", "()()()" ]
//Output 2:
//
//[ "()" ]
//
//
//Example Explanation
//Explanation 1:
//
// All paranthesis are given in the output list.
//Explanation 2:
//
// All paranthesis are given in the output list.


public class ValidParantheses {

    public static void main(String[] args) {
        int n = 1;
        build(0,0,n,"");
    }

    public static void build(int open,int close,int n,String str)
    {
        if(open + close == 2*n)
        {
            System.out.println(str);
            return;
        }

        if(open < n)
        {
            build(open+1,close,n,str+"(");
        }
        if(close < open)
        {
            build(open,close+1,n,str+")");
        }
    }
}
