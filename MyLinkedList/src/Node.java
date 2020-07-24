
public class Node {

	int data;
	Node next;
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	public int getData()
	{
		return data;
	}
	
	public Node getNode()
	{
		return next;
	}
	
	public boolean hasNextNode()
	{
		return this.next != null;
	}
	
	public String toString()
	{
		String ret = "[" + data + "]";
		
		if(this.next != null)
		{
			ret += "->" + next;
		}
		
		return ret;
	}
}
