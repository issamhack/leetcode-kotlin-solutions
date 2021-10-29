//https://leetcode.com/problems/container-with-most-water/submissions/
class ContainerWithMostWater{
    fun maxArea(height: IntArray): Int {
        var right = height.lastIndex
        var left = 0
        var maxA = 0
        while (left < right){
            val containerHeight = Math.min(height[left],height[right])
            val containerWidth = right - left
            maxA = Math.max(containerWidth*containerHeight,maxA)
            if(height[left] > height[right]) right-- else left++
            }
        return maxA
    }
}