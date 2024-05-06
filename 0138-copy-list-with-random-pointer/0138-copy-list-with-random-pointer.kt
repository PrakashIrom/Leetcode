/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    fun copyRandomList(node: Node?): Node? {
        
        val map:HashMap<Node?, Node?> = HashMap<Node?,Node?>()
        var curr=node
        
        while(curr!=null){
            var copy=Node(curr!!.`val`)
            map.put(curr,copy)
            curr=curr?.next
        }
        
        curr=node
        
        while(curr!=null){
            (map[curr])?.next=map[curr?.next]
            (map[curr])?.random=map[curr?.random]
            curr=curr?.next
        }
        
        curr=node
        
        val result: Node?=map[curr]
      return result
    }
}