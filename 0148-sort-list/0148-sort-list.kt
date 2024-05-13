/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun sortList(head: ListNode?): ListNode? {
        
        if(head==null || head.next==null) return head
        
        var left=head
        var right=findMid(head)
        val temp=right?.next
        right?.next=null
        
        left=sortList(left)
        right=sortList(temp)
        return mergeList(left,right)
        
    }
    
    fun findMid(head: ListNode?): ListNode?{
        var left=head
        var right=head?.next
        
        while(left!=null && right?.next!=null){
            left=left?.next
            right=right?.next?.next
        }
        return left
    }
    
    fun mergeList(left:ListNode?, right:ListNode?):ListNode?{
        var slow=left
        var fast=right
        var tail:ListNode? = ListNode()
        var dummy=tail
        
        
        while(slow!=null && fast!=null){
            if(slow!!.`val`<fast!!.`val`){
                tail?.next=slow
                tail=tail?.next
                slow=slow?.next
            }
            else{
                tail?.next=fast
                tail=tail?.next
                fast=fast?.next
            }
        }
        
        while(slow!=null || fast!=null){
            if(slow!=null){
                tail?.next=slow
                slow=slow?.next
                tail=tail?.next
            }
            else{
                tail?.next=fast
                fast=fast?.next
                tail=tail?.next
            }
        }
     return dummy?.next   
    }
}