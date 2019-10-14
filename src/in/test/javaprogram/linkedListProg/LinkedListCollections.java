package in.test.javaprogram.linkedListProg;

public class LinkedListCollections {

	public LinkedListCollections() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Merge two sorted linked lists and return it as a new list. The new list
	 * should be made by splicing together the nodes of the first two lists.
	 * 
	 * Example:
	 * 
	 * Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
	
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        if(l1==null){
	            return l2;
	        }
	        
	        if(l2==null){
	            return l1;
	        }
	        
	        ListNode mergeList =null;
	        
	        if(l1.data<l2.data){
	            mergeList=l1;
	            mergeList.next=mergeTwoLists(l1.next,l2);
	        }else {
	            mergeList= l2;
	            mergeList.next= mergeTwoLists(l1,l2.next);
	        }
	        
	        
	        return mergeList;
	        
	    }
	

}
