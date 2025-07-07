/* Binary Search Approach: 
                  Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 


Now, we will apply the binary search algorithm in the given array:

Step 1: Divide the search space into 2 halves:
In order to divide the search space, we need to find the middle point of it. So, we will take a ‘mid’ pointer and do the following:
mid = (low+high) // 2 ( ‘//’ refers to integer division)
Step 2: Compare the middle element with the target:
In this step, we can observe 3 different cases:
If arr[mid] == target: We have found the target. From this step, we can return the index of the target possibly.
If target > arr[mid]: This case signifies our target is located on the right half of the array. So, the next search space will be the right half.
If target < arr[mid]: This case signifies our target is located on the left half of the array. So, the next search space will be the left half.
Step 3: Trim down the search space:
Based on the probable location of the target we will trim down the search space.
If the target occurs on the left, we should set the high pointer to mid-1. Thus the left half will be the next search space.
Similarly, if the target occurs on the right, we should set the low pointer to mid+1. Thus the right half will be the next search space.
The above steps will continue until either we found the target or the search space becomes invalid i.e. high < low. By definition of search space, it will lose its existence if the high pointer is appearing before the low pointer.
*/




              //BINARY SEARCH CODE IMPLEMENTATION
import java.util.*;
public class Main {
    public static int binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
} 
