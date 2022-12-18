package practice;

public class leetcode234 {

	public static void main(String[] args) {
		 ListNode data=new ListNode(1);
			ListNode res=data;
			data.next=new ListNode(2);
			data.next.next=new ListNode(3);
			data.next.next.next=new ListNode(1);
			//ListNode res2=isPalindrome(res);
			//while(res2!=null)
			System.out.println(isPalindrome(res));
			//res2=res2.next;}
	}
	static ListNode start;
	public static boolean isPalindrome(ListNode head) {
        start=head;
       return  isPalindrome2(head);
    }
	
	public static boolean isPalindrome2(ListNode cur) {
		if(cur==null)
			return true;
		boolean res= isPalindrome2(cur.next) && (cur.val==start.val);
		start=start.next;
		return res;
		
	}
	
}
