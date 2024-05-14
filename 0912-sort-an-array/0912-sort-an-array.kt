class Solution {
    fun sortArray(nums: IntArray): IntArray {
        
        sortList(0,nums.size-1,nums)
        
        return nums
    }
    
    fun sortList(l:Int,r:Int,arr:IntArray){
        
        if(l<r){
            val mid = (r-l)/2+l
            
            sortList(l,mid,arr)
            sortList(mid+1,r,arr)
            merge(l,mid,r,arr)
            
        }
        
    }
    
    fun merge(l:Int, m:Int, r:Int, arr:IntArray){
        
        var n1=m-l+1
        var n2=r-m
        var left_arr=IntArray(n1)
        var right_arr=IntArray(n2)
        
        for(i in 0 until n1){
            left_arr[i]=arr[i+l]
        }
        
        for(i in 0 until n2){
            right_arr[i]=arr[i+m+1]
        }
        
        var i=0
        var j=0
        var k=l
        
        while(i<n1 && j<n2){
            if(left_arr[i]<=right_arr[j]){
                arr[k]=left_arr[i++]
            }
            else{
                arr[k]=right_arr[j++]
            }
            k++
        }
        
        while(i<n1){
                arr[k++]=left_arr[i++]
            }
        
        while(j<n2){
                arr[k++]=right_arr[j++]
            }
        }
    }
