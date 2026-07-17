typealias StackElement = Pair<Int, Int>

class MinStack() {
    private var currentMin: Int? = null
    private val stack = mutableListOf<StackElement>()

    fun push(value: Int) {
        if (stack.isEmpty()) {
            currentMin = value
            stack.add(value to value)
        } else {
            if (getMin() < value) {
                stack.add(value to getMin())
            } else {
                currentMin = value
                stack.add(value to value)
            }
        }
    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last().first
    }

    fun getMin(): Int {
        return stack.last().second
    }
}
