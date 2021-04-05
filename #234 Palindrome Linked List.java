**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode n = head;
        ArrayList<Integer> al = new ArrayList<>();
        while(n != null) {
            al.add(n.val);
            n = n.next;
        }
       boolean res = true;
       int j = al.size() -1;
       for(int i = 0; i < al.size() && j > i; i++) {
           if(al.get(i) == al.get(j)) {
               res = true;
               j--;
           }
           else{
               res= false;
               break;
           }
       }
        System.out.println(al);
        if(res) {return true;}
        else{return false;} 
    }
}