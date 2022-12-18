package practice;

public class leetcode203 {

	public static void main(String[] args) {
		ListNode data=new ListNode(1);
		ListNode res=data;
		data.next=new ListNode(2);
		data.next.next=new ListNode(6);
		data.next.next.next=new ListNode(3);
		data.next.next.next.next=new ListNode(4);
		System.out.println(removeElements(res, 6));
	}
	
	 
	 
	 public static ListNode removeElements(ListNode head, int val) {
	   
		
		if(head==null)
			return null;
		head.next=removeElements(head.next, val);
		return (head.val==val)?head.next:head;
			 
	  }
	 
//	 public static ListNode removeElements2(ListNode prev,ListNode cur,int val) {
//		
//	 }
	 
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
