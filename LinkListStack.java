package homework7;
import java.util.EmptyStackException;

public class LinkListStack
{
	protected Node top;
	protected int size;
	
	public LinkListStack()
	{
		top = null;
		size = 0;
	}//end constructor
	public boolean isEmptyL()
	{
		return top == null;
	}//end empty method
	public int getSize()
	{
		return size;
	}//end get size method
	public void pushL(char c)
	{
		Node node = new Node();
		node.ch = c;
		node.next = top;
		top = node;
		size++;
		/*Node current = new Node(c,null);
		if(top == null)
			top = current;
		else
		{
			current.setLink(top);//will add node
			top = current;
			size++;//increasing amount of nodes
		}//end else statement*/
	}//end 
	public char peekL()
	{
		if(isEmptyL())
			throw new EmptyStackException();
		else
			return top.getCharL();
	}//end peek method
	public char popL()
	{
		if(isEmptyL())
			throw new EmptyStackException();
		else
		{
			Node node = top;
			top = node.getLinkL();//remove node
			size--;//decrease size removing node
			return node.getCharL();
		}//end else statement
	}//end pop method
	public void outputLink()
	{
		System.out.print("Stack (top to bottom): ");
		if(size == 0)
		{
			System.out.print("Empty\n");
			return;
		}//end if statement
		Node node = top;
		while(node!= null)
		{
			System.out.print(node.getCharL());
			node = node.getLinkL();
		}//end while loop
		System.out.println();
	}//end output method
}//end link class
