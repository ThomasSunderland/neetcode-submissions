class Solution {
    val operationStack = mutableListOf<Int>()

    fun calPoints(operations: Array<String>): Int {
        // ["5","-2","4","C","D","9","+","+"]
        // [5, -2, 4, 8, 9, 17, 26]
        for (operation in operations) {
            when(operation) {
                "C" -> {
                    operationStack.popOperation()
                    println("$operation " + operationStack.joinToString())
                }
                "D" -> {
                    operationStack.peekOperation()?.let {
                        operationStack.pushOperation(it * 2)
                    }
                    println("$operation " + operationStack.joinToString())
                }
                "+" -> {
                    val previousOperation1 = operationStack.popOperation()
                    val previousOperation2 = operationStack.popOperation()

                    if (previousOperation1 != null && previousOperation2 != null) {
                        operationStack.pushOperation(previousOperation2)
                        operationStack.pushOperation(previousOperation1)
                        operationStack.pushOperation(previousOperation1 + previousOperation2)
                    }
                    println("$operation " + operationStack.joinToString())
                }                
                else -> {
                    operationStack.pushOperation(operation.toInt())
                    println("$operation " + operationStack.joinToString())
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

    private fun MutableList<Int>.peekOperation(): Int? {
        if (operationStack.isEmpty()) return null
        return operationStack[operationStack.size - 1]
    }
}
