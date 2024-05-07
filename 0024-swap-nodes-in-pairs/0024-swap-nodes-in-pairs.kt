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
    fun swapPairs(head: ListNode?): ListNode? {
        
        var dummy:ListNode? = ListNode()
        dummy?.next=head?.next
        var ptr=dummy
        var swap1=head
        var swap2=head?.next
        
        if(head?.next==null) return head
        
        while(swap2!=null){
            swap1?.next=swap2?.next
            swap2?.next=swap1
            ptr?.next=swap2
            ptr=swap1
            swap1=ptr?.next
            swap2=ptr?.next?.next
        }
        
       return dummy?.next 
    }
}