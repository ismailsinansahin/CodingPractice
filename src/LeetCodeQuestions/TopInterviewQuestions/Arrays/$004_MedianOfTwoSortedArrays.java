package LeetCodeQuestions.TopInterviewQuestions.Arrays;

public class $004_MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,5,6,8,9,12,13,18,19,25,26,32,45};
        int[] nums2 = {4,7,11,13,15,16,20,22,24,25,32,35,36,54};
        System.out.println(findMedianOfTwoSortedArrays(nums1, nums2));
    }

    public static double findMedianOfTwoSortedArrays(int[] arr1, int[] arr2) {

        if (arr1.length > arr2.length) return findMedianOfTwoSortedArrays(arr2, arr1);

        int low = 0;
        int high = arr1.length;
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        while (low <= high) {

            int partArr1 = (low + high) / 2;
            int partArr2 = (lengthArr1 + lengthArr2 + 1) / 2 - partArr1;
            int maxOfleftArr1;
            int minOfRightArr1;
            int maxOfleftArr2;
            int minOfRightArr2;

            if (partArr1 == 0) maxOfleftArr1 = Integer.MIN_VALUE;
            else maxOfleftArr1 = arr1[partArr1 - 1];

            if (partArr1 == arr1.length) minOfRightArr1 = Integer.MAX_VALUE;
            else minOfRightArr1 = arr1[partArr1];

            if (partArr2 == 0) maxOfleftArr2 = Integer.MIN_VALUE;
            else maxOfleftArr2 = arr2[partArr2 - 1];

            if (partArr2 == arr2.length) minOfRightArr2 = Integer.MAX_VALUE;
            else minOfRightArr2 = arr2[partArr2];

            if (maxOfleftArr1 <= minOfRightArr2 && maxOfleftArr2 <= minOfRightArr1) {
                if ((lengthArr1 + lengthArr2) % 2 == 0)
                    return ((double) (Math.max(maxOfleftArr1, maxOfleftArr2) + Math.min(minOfRightArr1, minOfRightArr2)) / 2);
                else
                    return ((double) Math.max(maxOfleftArr1, maxOfleftArr2));
            }
            else if (maxOfleftArr1 > minOfRightArr2)
                high = partArr1 - 1;
            else
                low = partArr1 + 1;
        }

        return -1;

    }

}


//    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        int beginIdx1 = 0;
//        int endIdx1 = nums1.length-1;
//        int currentLength1 = endIdx1 - beginIdx1 + 1;
//        double median1 = 0;
//        int median1Idx = -1;
//        int beginIdx2 = 0;
//        int endIdx2 = nums2.length-1;
//        int currentLength2 = endIdx2 - beginIdx2 + 1;
//        double median2 = 0;
//        int median2Idx = -1;
//        double median = 0;
//        boolean isTotalLengthOdd = (nums1.length + nums2.length) % 2 == 1;
//
//        //if nums1 is null
//        if(nums1.length == 0) return findMedian(nums2, beginIdx2, endIdx2);
//        //if nums2 is null
//        if(nums2.length == 0) return findMedian(nums1, beginIdx1, endIdx1);
//
//        //if nums2 continues
//        if(nums1[endIdx1] < nums2[beginIdx2]) return findMedian(nums1, nums2);
//        //if nums1 continues
//        if(nums2[endIdx2] < nums1[beginIdx1]) return findMedian(nums2, nums1);
//
//
//        while(!(currentLength1 == 2 && currentLength2 ==2)){
//            median1 = findMedian(nums1, beginIdx1, endIdx1);
//            median2 = findMedian(nums2, beginIdx2, endIdx2);
//            boolean bigger1 = median1 > median2;
//            boolean bigger2 = median2 > median1;
//            median1Idx = findMedianIdx(beginIdx1, endIdx1, bigger1);
//            median2Idx = findMedianIdx(beginIdx2, endIdx2, bigger2);
//            if(median1 > median2) {
//                endIdx1 = median1Idx;
//                beginIdx2 = median2Idx;
//            }
//            else{ //median2 > median1
//                endIdx2 = median2Idx;
//                beginIdx1 = median1Idx;
//            }
//            currentLength1 = endIdx1 - beginIdx1 + 1;
//            currentLength2 = endIdx2 - beginIdx2 + 1;
//        }

//        while((currentLength1 + currentLength2) >= 2){
//
//            if((currentLength1 == 1) && (currentLength2 == 1)) {
//                median1 = findMedian(nums1, beginIdx1, endIdx1);
//                median2 = findMedian(nums2, beginIdx2, endIdx2);
//                median = (median1 + median2) / 2;
//                break;
//            }
//
//            else if((currentLength1 == 1) && (currentLength2 == 2)) {
//                median = findMiddle(nums1, beginIdx1, nums2, beginIdx2, endIdx2);
//                break;
//            }
//
//            else if((currentLength1 == 2) && (currentLength2 == 1)) {
//                median = findMiddle(nums1, beginIdx1, endIdx1, nums2, beginIdx2);
//                break;
//            }
//
//            else if((currentLength1 == 2) && (currentLength2 == 2)) {
//                median = findMiddle(nums1, beginIdx1, endIdx1, nums2, beginIdx2, endIdx2);
//                break;
//            }
//
//            else{
//                median1 = findMedian(nums1, beginIdx1, endIdx1);
//                median1Idx = findMedianIdx(beginIdx1, endIdx1);
//                median2 = findMedian(nums2, beginIdx2, endIdx2);
//                median2Idx = findMedianIdx(beginIdx2, endIdx2);
//
//                if(median1 > median2) {
//                    if(currentLength1 == 2) endIdx1 = median1Idx - 1;
//                    else endIdx1 = median1Idx;
//                    beginIdx2 = median2Idx;
//                }
//                else{
//                    endIdx2 = median2Idx;
//                    beginIdx1 = median1Idx;
//                }
//                currentLength1 = endIdx1 - beginIdx1 + 1;
//                currentLength2 = endIdx2 - beginIdx2 + 1;
//            }
//
//        }
//        return median;
//    }
//
//    private static double findMiddle(int[] nums1, int beginIdx1, int[] nums2, int beginIdx2, int endIdx2) {
//        int length = nums1.length + nums2.length;
//        if(length % 2 == 1){
//            if(nums1[beginIdx1] > nums2[beginIdx2] && nums1[beginIdx1] < nums2[endIdx2]) return nums1[beginIdx1];
//            else return nums2[beginIdx2];
//        }
//        else{
//            if(nums1[beginIdx1] > nums2[beginIdx2]) return (double)(nums1[beginIdx1] + nums2[endIdx2]) / 2;
//            else return (double)(nums2[beginIdx2] + nums2[endIdx2]) / 2;
//        }
//    }
//
//    private static double findMiddle(int[] nums1, int beginIdx1, int endIdx1, int[] nums2, int beginIdx2) {
//        int length = nums1.length + nums2.length;
//        if(length % 2 == 1){
//            if(nums2[beginIdx2] > nums1[beginIdx1] && nums2[beginIdx2] < nums1[endIdx1]) return nums2[beginIdx2];
//            else return nums1[beginIdx1];
//        }
//        else{
//            if(nums2[beginIdx2] > nums1[beginIdx1]) return (double)(nums2[beginIdx2] + nums1[endIdx1]) / 2;
//            else return (double)(nums1[beginIdx1] + nums1[endIdx1]) / 2;
//        }
//    }
//
//    private static double findMiddle(int[] nums1, int beginIdx1, int endIdx1, int[] nums2, int beginIdx2, int endIdx2) {
//        if ((nums1[beginIdx1] > nums2[beginIdx2]) && (nums1[endIdx1] > nums2[endIdx2]))
//            return ((double) (nums2[beginIdx2] + nums2[endIdx2]) / 2);
//        else if ((nums1[beginIdx1] < nums2[beginIdx2]) && (nums1[endIdx1] < nums2[endIdx2]))
//            return ((double) (nums1[beginIdx1] + nums1[endIdx1]) / 2);
//        else if ((nums1[beginIdx1] > nums2[beginIdx2]) && (nums1[endIdx1] < nums2[endIdx2]))
//            return ((double) (nums2[beginIdx2] + nums1[endIdx1]) / 2);
//        else return ((double) (nums2[beginIdx2] + nums2[endIdx2]) / 2);
//    }
//
//    static double findMedian(int[] array1, int[] array2){
//        int totalLength = array1.length + array2.length;
//        if(array1.length == array2.length) return (double)(array1[array1.length-1] + array2[0]) / 2;
//        else if(totalLength % 2 != 0){
//            int medianIdx = (totalLength) / 2;
//            if(medianIdx < array1.length){
//                return array1[medianIdx];
//            }else return array2[medianIdx - array1.length];
//        }
//        else{
//            int medianIdx = (totalLength-1) / 2;
//            if(medianIdx+1 < array1.length){
//                return (double) (array1[medianIdx] + array1[medianIdx+1]) / 2;
//            }else return (double) (array2[medianIdx - array1.length] + array2[medianIdx - array1.length + 1]) / 2;
//        }
//    }
//
//    static double findMedian(int[] array, int beginIdx, int endIdx){
//        int length = endIdx - beginIdx + 1;
//        if(length % 2 == 0) return (double) (array[beginIdx + ((length - 1) / 2)] + array[beginIdx + (length / 2)]) / 2;
//        else return array[beginIdx + ((length - 1) / 2)];
//    }
//
//    static int findMedianIdx(int beginIdx, int endIdx, boolean bigger){
//        int length = endIdx - beginIdx + 1;
//        if(length % 2 == 1) return (beginIdx + (length / 2));
//        else if(bigger) return ((beginIdx + ((length - 1) / 2) + beginIdx + (length / 2)) / 2) + 1;
//        else return beginIdx + ((length - 1) / 2);
//    }
//
//    static double findMedianSortedArraysWithMerging(int[] nums1, int[] nums2) {
//        int[] nums = mergeArrays(nums1, nums2);
//        if(nums.length % 2 != 0) return nums[nums.length / 2];
//        else return (double)(nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
//    }
//
//    private static int[] mergeArrays(int[] nums1, int[] nums2) {
//        int[] nums = new int[nums1.length + nums2.length];
//        int i = 0;
//        int idx1 = 0;
//        int idx2 = 0;
//        while(i<nums.length){
//            if(idx1 == nums1.length){
//                nums[i] = nums2[idx2];
//                idx2++;
//            }
//            else if(idx2 == nums2.length){
//                nums[i] = nums1[idx1];
//                idx1++;
//            }
//            else if(idx1 < nums1.length && nums1[idx1] <= nums2[idx2]){
//                nums[i] = nums1[idx1];
//                idx1++;
//            }
//            else if(idx2 < nums2.length && nums2[idx2] < nums1[idx1]){
//                nums[i] = nums2[idx2];
//                idx2++;
//            }
//            i++;
//        }
//        System.out.println(Arrays.toString(nums));
//        return nums;
//    }
//
//}
