package level1;
// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if (head == null){
        head = newNode;
        return head;
        }

        ListNode point = head;
        while(point.next != null){
        point=point.next;
        }

        point.next = newNode;

        return head;
        }