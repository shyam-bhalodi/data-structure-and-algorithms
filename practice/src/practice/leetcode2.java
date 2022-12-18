package practice;

public class leetcode2 {

	public static void main(String[] args) { 
	ListNode data=new ListNode(1);
	ListNode res=data;
	data.next=new ListNode(2);
	data.next.next=new ListNode(3);
	data.next.next.next=new ListNode(4);
	ListNode res2=addTwoNumbers(res,res);
	while(res2!=null)
	{
		System.out.println("value is "+res2.val);
		res2=res2.next;
	}
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sl1=l1;
        ListNode sl2=l2;
        addPreceedingZeros(sl1, sl2);
        ListNode res=new ListNode(0);
        int c=sumNumbers(sl1,sl2,res);
        if(c>0) {
        	ListNode temp=new ListNode(c);
        	temp.next=res;
        	res.next=temp;
        }
        return res.next;
    }
	
	public static int sumNumbers(ListNode l1,ListNode l2,ListNode res) {
		
		if(l1==null || l2==null)
			return 0;
		int sum=l1.val+l2.val+sumNumbers(l1.next, l2.next, res);
		System.out.println("sum is "+sum);
		ListNode temp=new ListNode(sum%10);
		temp.next=res;
		res.next=temp;
		return sum/10;
	}
	
	public static void addPreceedingZeros(ListNode sl1,ListNode sl2) {
		ListNode l1=sl1;
		ListNode l2=sl2;
		while(l1!=null && l2!=null) {
			l1=l1.next;
			l2=l2.next;
		}
		if(l1==null && l2!=null) {
			while(l2!=null) {
				ListNode temp=new ListNode(0);
				temp.next=sl1;
				sl1=temp;
				l2=l2.next;
			}
		}else if(l2==null && l1!=null) {
			while(l1!=null) {
				ListNode temp=new ListNode(0);
				temp.next=sl2;
				sl2=temp;
				l1=l1.next;
			}
		}
	}

}
