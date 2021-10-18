package LeetCodeQuestions.TopInterviewQuestions.SortingAndSearching;

import java.util.Arrays;

public class $088_MergeSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
//        int[] nums1 = {1};
//        int[] nums2 = {};
//        int[] nums1 = {};
//        int[] nums2 = {1};
        int m = 3;
        int n = 3;
        System.out.println("Input  : nums1 = " + Arrays.toString(nums1) + ", m = " + m +
                ", nums2 = " + Arrays.toString(nums2) + ", n = " + n);
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int po = 0;
        int[] output = new int[m+n];
        while (po<m+n) {
            if((m > 0) && (p1 < m) && (nums1[p1] < nums2[p2])){
                output[po] = nums1[p1];
                p1++;
                po++;
            }else{
                output[po] = nums2[p2];
                p2++;
                po++;
            }
        }
        while (po < m+n){
            output[po] = nums1[p1];
            p1++;
            po++;
        }
        System.out.println("Output : " + Arrays.toString(output));
    }

}
