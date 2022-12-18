package practice;

public class leetcode21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	       if(list1==null)
	    	   return list2;
	       if(list2==null)
	    	   return list1;
	       ListNode cur=new ListNode();
	       if(list1.val>list2.val) {
	    	   cur.val=list2.val;
	    	   list2=list2.next;
	       }else {
	    	   cur.val=list1.val;
	    	   list1=list1.next;
	       }
	       cur.next=mergeTwoLists(list1, list2);
	       return cur;
    }

}
