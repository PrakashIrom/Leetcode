class Solution {
    fun maxVowels(s: String, k: Int): Int {
     
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var l = 0
        var h = k
        var result = 0
        var count = 0
        
        for(i in 0 until k){
            if(vowels.contains(s[i])) count++
        }
        
        result = count
        
          for (i in k until s.length) {
            // Add the new character at the end of the window
            if (s[i] in vowels) count++
            // Remove the old character at the start of the window
            if (s[i - k] in vowels) count--

            // Update max vowels count if current count is greater
            result = maxOf(result, count)
        }
        
        return result
    }
}