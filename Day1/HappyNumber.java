/*Leetcode 202. Happy Number
Easy
Topics
premium lock icon
Companies
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false
*/

class HappyNumber {
    public boolean isHappy(int n) {
        while(n!=4){
            if(n==1)    return true;
            n=check(n);
        }
        return false;
    }
    public int check(int a){
            int rem=0,rev=0;
            while(a>0){
                rem=a%10;
                a=a/10;
                rev=rev+rem*rem;
            }
            return rev;
        }
}