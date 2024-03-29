import java.util.Stack;

public class ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
	        Stack<ListNode> stack=new Stack<ListNode>();
	        while(head!=null)
	        {
	            stack.push(head);
	            head=head.next;
	        }
	        ListNode dummy=new ListNode(-1);
	        head=dummy;
	        while(!stack.isEmpty())
	        {
	            ListNode current=stack.pop();
	            head.next=new ListNode(current.val);
	            head=head.next;
	        }
	        return dummy.next;
	    }
}
