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
    fun hasCycle(head: ListNode?): Boolean {
        //Floyd's Tortoise and Hare algorithm
        var h=head
        var t=head?.next
        
        if(t==null){
            return false
        }
        
        while(h!=t){
            if(t==null){
                return false
            }
            h=h?.next
           t=t?.next?.next
        }
        
        
        return true
    }
}