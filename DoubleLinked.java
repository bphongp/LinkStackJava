package homework7;

import java.util.EmptyStackException;

public class DoubleLinked
{
	protected DoubleNode top = null;
	protected DoubleNode bottom = null;
	protected int size;
	
	public DoubleLinked()
	{
		size = 0;
		top = null;
	}//end constructor
	public void pushDL(char data)
	{
		DoubleNode node =new DoubleNode(data);
		if(top == null)
		{
			node.next = null;//new node not point at anything yet
			node.prev = null;
			top = node;
			bottom = node;
		}//end else statement
		else
		{
			top.prev = node;
			node.next = top;
			node.prev = null;
			top = node;
		}//end else statement
		size++;
	}//end push method
	public boolean emptyDL()
	{
		return top==null;
	}//end empty method
	public void outputDList()
	{
		DoubleNode current = top;
		System.out.print("Stack (top to bottom): ");
		if(size == 0)
		{
			System.out.print("Empty\n");
			return;
		}//end if statement
		while(current!=null)
		{
			System.out.print(current.getCharDL());
			current = current.getLinkDL();
		}//end while loop
		System.out.println();
	}//end output 
	public void popDL()
	{
		if(emptyDL())
			throw new EmptyStackException();
		else
		{
			if(top.next ==null)
			{
				top = null;
				bottom = null;
			}//end inner if
			else
			{
				bottom = bottom.prev;
				bottom.next = null;
			}//end inner else
		}//end else statement
		size--;
	}//end pop method
	public char peekDL()
	{
		if(emptyDL())
			throw new EmptyStackException();
		else
			return top.getCharDL();
	}//end peek method
}//end class double linked
