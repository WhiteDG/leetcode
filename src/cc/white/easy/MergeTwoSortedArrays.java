package cc.white.easy;

/**
 * @author White
 */
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p = nums1.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums2[p2] >= nums1[p1] ? nums2[p2--] : nums1[p1--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
