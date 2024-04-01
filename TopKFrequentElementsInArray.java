// Given a non-empty array nums[] of integers of length N, find the top k elements which have the highest frequency in the array. If two numbers have same frequencies, then the larger number should be given more preference.

// Example 1:
// Input:
// N = 6
// nums = {1,1,1,2,2,3}
// k = 2
// Output: {1, 2}

// Example 2:
// Input:
// N = 8
// nums = {1,1,2,2,3,3,3,4}
// k = 2
// Output: {3, 2}
// Explanation: Elements 1 and 2 have the
// same frequency ie. 2. Therefore, in this
// case, the answer includes the element 2
// as 2 > 1.

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsInArray {
    public static void main(String[] args) {
        int n1 = 6, k1 = 2;
        int nums1[] = {1,1,1,2,2,3};
        int res1[] = topK(nums1, k1);
        display(res1);

        int n2 = 8, k2 = 2;
        int nums2[] = {3,2};
        int res2[] = topK(nums2, k2);
        display(res2);
    }

    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
    }
    public static int[] topK(int[] nums, int k) {
        int[] Store_Kelement = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> (a.first == b.first) ? (a.second - b.second) : (a.first - b.first));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getValue(), entry.getKey()));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int j = k - 1;
        while (pq.size() > 0) {
            Store_Kelement[j--] = pq.poll().second;
        }

        return Store_Kelement;
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
