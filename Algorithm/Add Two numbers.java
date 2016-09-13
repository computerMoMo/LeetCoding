public class addtwosums {
    public ListNode addtwosums (ListNode l1,ListNode l2)
    {
        ListNode result = new ListNode(0);
        ListNode cur = result;

        int sum,carry;
        carry = 0;
        int v1,v2;
        while(l1!=null && l2!=null)
        {
            v1 = l1.val;
            v2 = l2.val;
            sum = v1+v2+carry;
//            cur.val = sum%10;
            carry = sum/10;
//            cur = cur.next;
//            cur = new ListNode(0);
            cur.next = new ListNode(sum%10);
            cur=cur.next;
            l1 = l1.next;
            l2 = l2.next;

        }
        return result.next;

    }
}
