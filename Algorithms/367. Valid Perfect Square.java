// Source : https://leetcode.com/problems/valid-perfect-square/
// Author : Shrey Shah
// Date   : 21/12/2021


/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1
*/


class Solution {
    public boolean isPerfectSquare(int num) {

	//Using in-built pow(), dropping the fractional part and checking if equal to the actual square root
        double root = Math.pow(num, 0.5);
        if(root == (int)root)
            return true;
        else
            return false;
    }
}
}


/*
Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
Memory Usage: 40.4 MB, less than 30.97% of Java online submissions for Valid Perfect Square.

Time Submitted	22/02/2022 05:26
Status		Accepted
Runtime		0 ms
Memory		40.4 MB
Language		java
*/