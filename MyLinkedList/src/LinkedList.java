
public class LinkedList {
	
	Node head;

	public void insert(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
		}
		
		else
		{                                                                                   
			Node tempNode = head;
			while(tempNode.next != null)
			{
				tempNode = tempNode.next;
			}
			
			tempNode.next = newNode;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node  newNode = new Node();
		newNode.data = data;
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAt(int index, int data, LinkedList list)
	{
		Node newNode = new Node();
		newNode.data = data;
		
		if(index == 0)
		{
			insertAtStart(data);
		}
		
		else
		{
			if(index < 0 || index > list.getSize())
			{
				System.out.println("The provided index is invalid");
			}
			
			else
			{
				Node tempNode = head;
				//for(int i = 0; i <   3   - 1; i++)	
				for(int i = 0; i < index; i++)
				{
					tempNode = tempNode.next;
				}
		
				newNode.next = tempNode.next;
				tempNode.next = newNode;
			}
		}
	}
	
	public void deleteAt(int index)
	{
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			Node tempNode = head;
			for(int i = 0; i < index - 1; i++)
			{
				tempNode = tempNode.next;
			}
			
			Node deletingNode = tempNode.next;
			tempNode.next = deletingNode.next;
			deletingNode = null;
		}
	}
	
	public void show()
	{
		Node tempNode = head;
		while(tempNode.next != null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.data);
		
	}
	
	public int getFrom(int index)
	{
		Node tempNode = head;
		for(int i = 0; i < index; i++)
		{
			tempNode = tempNode.next;
		}
		
		return tempNode.data;
	}

	public int getSize()
	{
		int size = 0;
		
		Node tempNode = head;
		
		while(tempNode.next != null)
		{
			tempNode = tempNode.next;
			size++;
		}
		size ++;
		
		return size;
	}

	public boolean isContain(int value, LinkedList list)
	{
		boolean flag = false;
		
		int size = list.getSize();
		
		Node tempNode = list.head;
		for(int i = 0; i < size; i++)
		{
			if (tempNode.data == value)
			{
				flag = true;
				break;
			}
			tempNode = tempNode.next;
		}
		
		return flag;
	}
	
	public int getLast(LinkedList list)
	{
		int result = 0;
		Node tempNode = list.head;
		for(int i = 0; i < list.getSize() - 1; i++)
		{
			tempNode = tempNode.next;
		}
		
		result = tempNode.data;
		
		return result;
	}

	public String toString(LinkedList list)
	{
		String ret = null;
		
		Node tempNode = head;
		while(tempNode.next != null)
		{
			ret += String.valueOf(tempNode.data);
			tempNode = tempNode.next;
		}
		ret += String.valueOf(tempNode.data);
		
		
		return ret;
	}
	
	public void push(int data)
	{
		if(head == null)
		{
			insertAtStart(data);
		}
		
		else
		{
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void pop()
	{
		//Node tempnode;  
		if(head != null)
		{
			Node tempNode = head;
			head = head.next;
			System.out.println(tempNode.data);
		}
		
		else
		{
			System.out.println("Stack is empty");
		}
		
		
	}
	
	public void showStack()
	{
		Node tempNode = head;
		while(tempNode.next != null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		
		System.out.println(tempNode.data);
	}

	
}
