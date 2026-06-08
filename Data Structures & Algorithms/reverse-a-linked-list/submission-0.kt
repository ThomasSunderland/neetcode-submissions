/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null

        // [0, 1, 2, 3]
        var current = head // 0
        var previous: ListNode? = null // null

        while (current != null) {
            val nextNode = current?.next // 1, 2, 3
            current?.next = previous // null, 0, 1

            previous = current // 0, 1, 2
            current = nextNode // 1, 2, 3
        }

        return previous
    }
}
