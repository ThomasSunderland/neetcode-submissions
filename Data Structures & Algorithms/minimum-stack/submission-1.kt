class MinStack() {

    private val stack = mutableListOf<Int>()

    fun push(value: Int) {
        stack.add(value)
    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return stack.min()
    }
}
