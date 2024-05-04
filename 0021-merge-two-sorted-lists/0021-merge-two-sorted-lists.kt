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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        
        var resultNode:ListNode?=null
        var current:ListNode?=null
        var list_1=list1
        var list_2=list2
        
        while(list_1!=null  && list_2!=null){
            if(list_1.`val`<list_2.`val`){
                if(resultNode==null){
                    resultNode=list_1
                    current=resultNode
                }
                else{
                   current?.next=list_1
                    current=current?.next
                }
                list_1=list_1.next
            }
            else{
                if(resultNode==null){
                    resultNode=list_2
                    current=resultNode
                }
                else{
                  current?.next=list_2
                    current=current?.next
                }
                list_2=list_2.next
            }
        }
        
        while(list_1!=null || list_2!=null){
            if(list_1!=null){
                if(resultNode==null){
                    resultNode=list_1
                }
                current?.next=list_1
                current=current?.next
                list_1=list_1?.next
            }
            else{
                if(resultNode==null){
                    resultNode=list_2
                }
                 current?.next=list_2
                current=current?.next
                list_2=list_2?.next
            }
        }
        return resultNode
    }
}