package practice;

public class leetcode206 {
 public static void main(String[] args) {
	 ListNode data=new ListNode(1);
		ListNode res=data;
		data.next=new ListNode(2);
		data.next.next=new ListNode(3);
		data.next.next.next=new ListNode(4);
		ListNode res2=reverseList(res);
		while(res2!=null)
		{System.out.println(res2.val);
		res2=res2.next;}
}
 
 public static ListNode reverseList(ListNode head) {
     if(head.next==null)
         return head;
     ListNode res=reverseList(head.next);
     head.next.next=head;
     head.next=null;
     return res;
     
 }
 
}
