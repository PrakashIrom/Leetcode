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
    fun reorderList(head: ListNode?): Unit {
        var ptr1=head
        var ptr2=head
        
        while(ptr1?.next?.next!=null){
            if(ptr2?.next?.next==null){
                val node=ListNode(ptr2!!.next!!.`val`)
                ptr2?.next=null
                node?.next=ptr1?.next
                ptr1?.next=node
                ptr1=ptr1?.next?.next
                ptr2=ptr1?.next
            }
            else{
                ptr2=ptr2?.next
            }
        }
    }
}