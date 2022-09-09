public class MissingNumber {

    public static int[] sortArray(int[] nums)
    {
         int temp = 0;

         for (int i  = 0; i < nums.length - 1; i++)
         {
             for (int j = 0; j < nums.length - i - 1; j++)
             {
                 if(nums[j] > nums[j+1])
                 {
                     temp = nums[j];
                     nums[j] = nums[j+1];
                     nums[j+1] = temp;
                 }
             }
         }

         return nums;
    }


    public static int missingNumber(int[] nums) {
        int missing = 0;
        boolean match = false;
        if (nums.length == 1)
        {
            if(nums[0] == 0)
                missing = 1;
        }
        else
        {
            int[] sortedNums = sortArray(nums);
            if(sortedNums[0] != 0)
            {
                missing = 0;
            }
            else
            {
                for (int i = 0; i < sortedNums.length - 1; i++)
                {
                    if(sortedNums[i+1] - sortedNums[i] != 1)
                    {
                        missing = sortedNums[i] + 1;
                        match = true;
                    }
                }
                if (!match)
                {
                    missing = sortedNums[sortedNums.length-1] + 1;
                }
            }

        }
        return missing;
    }

    public static void main(String[] args) {
        int[] input = {1,2};
        int missingNumber = missingNumber(input);
        System.out.println("Missing number = " + missingNumber);

    }
}
