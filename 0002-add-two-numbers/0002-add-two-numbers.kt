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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        
        var carry=0
        var list1=l1
        var list2=l2
        var result:ListNode?=null
        var current:ListNode?=null
        
        while(list1!=null && list2!=null){
            
            val sum=list1!!.`val`+list2.`val`+carry
            carry=0
            
            if(result==null){
                result=ListNode(sum%10)
                carry=sum/10
                current=result
                 list1=list1?.next
                list2=list2?.next
                continue
            }
            else{
                current?.next=ListNode(sum%10)
                carry=sum/10
            }
            list1=list1?.next
            list2=list2?.next
            current=current?.next
        }
        
        while(list1!=null || list2!=null || carry!=0){
            if(list1!=null){
                val sum=list1!!.`val`+carry
                current?.next=ListNode(sum%10)
                carry=sum/10
                list1=list1.next
            }
            else if(list2!=null){
                 val sum=list2!!.`val`+carry
                 current?.next=ListNode(sum%10)
                carry=sum/10
                list2=list2?.next
            }
            else{
                current?.next=ListNode(carry)
                carry=0
            }
            current=current?.next
        }
        
        return result
    }
}