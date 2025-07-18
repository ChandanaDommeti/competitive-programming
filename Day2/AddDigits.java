/* Leetcode 258. Add Digits
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 

Constraints:

0 <= num <= 231 - 1
*/

class AddDigits {
    public int addDigits(int n) {
        while(n>9){
            n=check(n);
        }
        return n;
    }
    int check(int n){
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev+d;
            n=n/10;
        }
        return rev;
//or
// if(n==0)  return 0;
//  return n%9==0 ? 9:n%9;
    }
}