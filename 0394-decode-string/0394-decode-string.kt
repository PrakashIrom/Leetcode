import java.util.*

class Solution {
    fun decodeString(s: String): String {
        val stack = Stack<Any>()
        
        var i = 0
        while (i < s.length) {
            if (s[i] != ']') {
                stack.push(s[i])
                i++
            } else {
                // Step 1: Extract the substring
                val sub = StringBuilder()
                while (stack.isNotEmpty() && stack.peek() is Char && stack.peek() as Char != '[') {
                    sub.insert(0, stack.pop() as Char)
                }
                stack.pop() // Remove the '['

                // Step 2: Extract the number
                val digit = StringBuilder()
                while (stack.isNotEmpty() && stack.peek() is Char && (stack.peek() as Char).isDigit()) {
                    digit.insert(0, stack.pop() as Char)
                }

                // Step 3: Repeat the substring
                val repeatCount = digit.toString().toInt()
                val repeatedString = sub.toString().repeat(repeatCount)

                // Push the result back onto the stack as characters
                for (ch in repeatedString) {
                    stack.push(ch)
                }
                i++
            }
        }

        // Construct the final result from the stack
        val result = StringBuilder()
        while (stack.isNotEmpty()) {
            result.insert(0, stack.pop())
        }

        return result.toString()
    }
}