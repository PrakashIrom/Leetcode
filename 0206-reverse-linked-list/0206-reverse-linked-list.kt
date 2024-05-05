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
    fun reverseList(head: ListNode?): ListNode? {
        
        var current=head
        var result:ListNode?=null
        
        while(current!=null)
        {   
            val value=ListNode(current.`val`)
            if(result==null){
                result=value
            }else{
                value.next=result
                result=value
            }
            current=current.next
        }
        
        return result
    }
}