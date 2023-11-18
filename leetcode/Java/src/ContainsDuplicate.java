import java.util.HashSet;

/**
217. Contains Duplicate
Easy
11.1K
1.3K
Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};
        System.out.println(containsDuplicate(num));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> myHashSet = new HashSet<>();
        for (int num : nums) {
       
         if (myHashSet.contains(num)) {
            return true;
         }
         myHashSet.add(num);
        }
        return false;
       
    }
    
}