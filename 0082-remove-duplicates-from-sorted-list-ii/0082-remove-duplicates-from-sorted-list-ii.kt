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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        
        val dummy:ListNode? = ListNode()
        dummy?.next=head
        var ptr=dummy
        var l=head
        var r=head?.next
        
        while(r!=null){
            if(l!!.`val`!=r!!.`val`){
                ptr=l
                l=r
                r=r?.next
            }
            else{
                while(r!=null && l!!.`val`==r!!.`val` ){
                    l=r
                    r=r?.next
                }
                ptr?.next=r
                l=r
                r=r?.next
            }
        }
        return dummy?.next
    }
}