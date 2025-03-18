package Practice;

public class Leetcodeproblem {
    public static void main(String[] args) {
        int [] nums ={0,1,1,1,2,2,3,3,4};
        Leetcodeproblem l = new Leetcodeproblem();
        int res = l.removeDuplicates(nums);
        System.out.println(res);
    }
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for (int n : nums)
                if (i == 0 || n > nums[i-1])
                    nums[i++] = n;
            return i;
        }
    }