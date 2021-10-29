//https://leetcode.com/problems/two-sum/submissions/
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices){
            val nextOfi = i+1 
            for (j in nextOfi..nums.lastIndex){
                if( nums[i]+nums[j] == target){
                    return intArrayOf(i,j)
                }
            }
            
        }
        return intArrayOf(0, 1)
    }
}