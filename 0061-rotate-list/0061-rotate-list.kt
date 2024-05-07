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
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        var curr=head
        var n=0
        var hare=head
        
        while(curr!=null){
            n++
            curr=curr?.next
        }
        
        if(n==0 || (n==1 && k==1)) return head
        
        curr=head
        n=k%n
        
        repeat(n){
                hare=hare?.next
            }

        while(curr!=null){
            
            if(hare?.next==null){
              hare?.next=head
                val result=curr?.next
                curr?.next=null
                return result
            }
            curr=curr?.next
            hare=hare?.next
        }
        return head
    }
}