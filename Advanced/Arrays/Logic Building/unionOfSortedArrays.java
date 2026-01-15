import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        List<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                    unionList.add(nums1[i]);
                }
                i++;
            } 
            else if (nums1[i] > nums2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                    unionList.add(nums2[j]);
                }
                j++;
            } 
            else {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                    unionList.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                unionList.add(nums1[i]);
            }
            i++;
        }

        while (j < m) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                unionList.add(nums2[j]);
            }
            j++;
        }

        int[] union = new int[unionList.size()];
        for (int k = 0; k < unionList.size(); k++) {
            union[k] = unionList.get(k);
        }

        return union;
    }
}
