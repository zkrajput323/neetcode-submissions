# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        
        currentNode = head
        pre = None
        while currentNode:
            tempNode = currentNode.next
            currentNode.next = pre
            pre = currentNode
            currentNode = tempNode
        return pre
        