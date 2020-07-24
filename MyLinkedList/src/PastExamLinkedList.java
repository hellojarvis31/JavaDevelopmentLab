
public class PastExamLinkedList {

	Node head;
	
	public PastExamLinkedList(int data) 
	{
		head.data = data;
		head.next = null;
	}
	
	public void printAllElements()
	{
		Node tempNode = head;
		while(tempNode != null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		
		
	}

	public void addAt(int index, int data)
	{
		Node newNode = new Node();
		if(index == 0)
		{
			Node tempNode = head;
			head = newNode;
			newNode.next = tempNode;
		}
		
		else
		{
			Node tempNode = head;
			for(int i = 0; i < index; i++)
			{
				tempNode = tempNode.next;
			}
			
			tempNode.next = newNode;
			newNode.next = tempNode.next;
			
		}
	}
}
