//package Leetcode;

import java.util.Arrays;

public class nAndDouble {

    // Binary Search function
    static boolean binarySearch(int arr[], int n, int target) {

        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] < target) {
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    // LeetCode required function
    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int target = arr[i] * 2;
            boolean found = binarySearch(arr, n, target);

            if (found) {

                // Special handling for zero
                if (arr[i] == 0) {
                    if ((i - 1 >= 0 && arr[i - 1] == 0) ||
                        (i + 1 < n && arr[i + 1] == 0)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    // Main method for local testing
    public static void main(String[] args) {

        nAndDouble obj = new nAndDouble();

        int[] arr = {10, 2, 5, 3};
        System.out.println(obj.checkIfExist(arr)); // true
    }
}
