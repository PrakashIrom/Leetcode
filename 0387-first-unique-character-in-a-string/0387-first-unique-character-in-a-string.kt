class Solution {
    fun firstUniqChar(s: String): Int {
        val freq = IntArray(26) { 0 }

        for(i in 0 until s.length){
            freq[s[i]-'a']++
        }

        for(i in 0 until s.length){
            if(freq[s[i] - 'a'] == 1) return i
        }

        return -1
    }
}