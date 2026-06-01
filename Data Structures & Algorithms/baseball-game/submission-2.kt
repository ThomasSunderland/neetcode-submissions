class Solution {
    val operationStack = mutableListOf<Int>()

    fun calPoints(operations: Array<String>): Int {
        // ["5","-2","4","C","D","9","+","+"]
        // [5, -2, -4, 9, 5, 14] = 27
        for (operation in operations) {
            when(operation) {
                "C" -> {
                    operationStack.popOperation()
                    //println("$operation " + operationStack.joinToString())
                }
                "D" -> {
                    operationStack.peekOperation()?.let {
                        operationStack.pushOperation(it * 2)
                    }
                    //println("$operation " + operationStack.joinToString())
                }
                "+" -> {
                    val previousOperation1 = operationStack.peekOperation()
                    val previousOperation2 = operationStack.peekOperation(pointer = 2)

                    if (previousOperation1 != null && previousOperation2 != null) {
                        operationStack.pushOperation(previousOperation1 + previousOperation2)
                    }
                    //println("$operation " + operationStack.joinToString())
                }                
                else -> {
                    operationStack.pushOperation(operation.toInt())
                    //println("$operation " + operationStack.joinToString())
                }
            }
        }

        return operationStack.sum()
    }

    private fun MutableList<Int>.pushOperation(operation: Int) {
        operationStack.add(operation)
    }

    private fun MutableList<Int>.popOperation(): Int? {
        if (operationStack.isEmpty()) return null
        return operationStack.removeAt(operationStack.size - 1)
    }

    private fun MutableList<Int>.peekOperation(
        pointer: Int = 1,
    ): Int? {
        if (operationStack.isEmpty()) return null
        return operationStack[operationStack.size - pointer]
    }
}
