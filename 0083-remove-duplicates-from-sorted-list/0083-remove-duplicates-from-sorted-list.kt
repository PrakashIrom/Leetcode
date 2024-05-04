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
       
        var resultList:ListNode?=head
        var current:ListNode?=head
        var list=head
        
        while(list!=null){
            list=list?.next
           if(current?.`val`!=list?.`val`){
              current?.next=list
               current=list
           }
        }
        return resultList
    }
}