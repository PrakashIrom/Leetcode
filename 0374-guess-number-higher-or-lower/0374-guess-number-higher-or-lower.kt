/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        
        var low = 0
        var high = n
        
        while(low<=high){
            val mid=(high-low)/2+low
            
            if(guess(mid)==0) return mid
            else if(guess(mid)==-1) high=mid-1
            else low=mid+1
        }
        
        return -1
    }
}