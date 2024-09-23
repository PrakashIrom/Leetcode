/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    
    var flag = true
    
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        
        if((p==null && q!=null) || (p!=null && q==null)) flag=false
        
        if(p!=null){
        isSameTree(p?.left, q?.left)
        if(p?.`val`!=q?.`val`) flag=false
        isSameTree(p?.right, q?.right)
        }
        
        return flag
               
    }
}