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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        
       var dummy:ListNode?=ListNode()
       dummy?.next=head
        var curr=dummy
        var track=head

       for(i in 0 until n){
           track=track?.next
       }
       
       if(track==null){
           dummy?.next=dummy?.next?.next
           return dummy?.next
       }
       
       while(track!=null){
           curr=curr?.next
           track=track?.next
           if(track==null){
               curr?.next=curr?.next?.next
           }
       }
       
        return dummy!!.next
    }
}