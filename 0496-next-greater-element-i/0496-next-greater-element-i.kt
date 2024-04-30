import java.util.ArrayDeque
class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        var res=IntArray(nums1.size){-1}
        var stack=ArrayDeque<Int>()
        var hm=HashMap<Int,Int>()
        
        for(i in 0 until nums1.size){
            hm.put(nums1[i],i)
        }
        
        for(i in 0 until nums2.size){
            if(stack.isEmpty()){
                stack.push(nums2[i])
            }else{
                while(stack.peek()!=null && stack.peek()<nums2[i]){
                    if(hm.containsKey(stack.peek())){
                        res[hm[stack.peek()]!!]=nums2[i]
                    }
                    stack.pop()
                }
                stack.push(nums2[i])    
            }
        }
        
        return res
    }
}