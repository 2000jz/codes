public class 1004. Max Consecutive Ones III {
    public static void main(String[] args) {
        // 1004. Max Consecutive Ones III
        class Solution {
    public int longestOnes(int[] nums, int k) {
        int i =0, j=0, maxs =0, sum =0;
        while(i<nums.length){
            if(k>0 || nums[i]==1){
                if(nums[i]==1) {
                sum += 1;
                maxs = Math.max(maxs,sum);
                }
                else{
                    sum += 1;
                    k--;
                    maxs = Math.max(maxs,sum);
                }
                i++;        //  1 0 0 1 0 1     2
            }
            else if(k==0){
                while(k==0){
                    if(nums[j]==1){
                         sum--;
                        j++;
                        maxs = Math.max(maxs,sum);
                    }
                    else {
                    k++;
                    sum--;
                    j++;
                    maxs = Math.max(maxs,sum);
                }
                }
            }
        }
    return maxs;
    }
}

    }
}
//  trying diff approach