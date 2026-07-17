class Solution {
    fun isValid(s: String): Boolean {
        val opening = listOf('(', '[', '{')
        val closing = listOf(')', ']', '}')

        val simpleStack = SimpleStack()

        runCatching {
            for (ch in s.toCharArray()) {
                if (ch in opening) simpleStack.push(ch)

                else if (ch in closing) {
                    when (ch) {
                        ')' -> {
                            if (simpleStack.pop() != '(') return false
                        }

                        ']' -> {
                            if (simpleStack.pop() != '[') return false
                        }

                        '}' -> {
                            if (simpleStack.pop() != '{') return false
                        }
                    }
                }
            }
        }.onFailure {
            return false
        }

        return simpleStack.isEmpty()
    }
}

class SimpleStack {
    private val stack = mutableListOf<Char>()

    fun isEmpty(): Boolean = stack.isEmpty()

    fun push(char: Char) {
        stack.add(char)
    }

    fun pop(): Char {
        if (isEmpty()) throw IllegalStateException("Pop on empty stack")

        return stack.removeLast()
    }
}
