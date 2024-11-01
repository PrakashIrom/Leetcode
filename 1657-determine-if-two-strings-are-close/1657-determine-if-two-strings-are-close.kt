class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
     
/*
Check if the sets of characters in word1 and word2 are the same. If not, return false.
Count the frequency of each character in both word1 and word2.
Sort these frequency counts.
Check if the sorted frequency lists are equal. If they are, return true; otherwise, return false.
*/
    if (word1.toSet() != word2.toSet()) return false
    
    // Step 2: Count the frequency of each character in both words
    val freq1 = word1.groupingBy { it }.eachCount()
    val freq2 = word2.groupingBy { it }.eachCount()
    
    // Step 3: Sort the frequency values and compare them
    return freq1.values.sorted() == freq2.values.sorted()
        
    }
}