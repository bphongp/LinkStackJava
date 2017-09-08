package homework7;

public class DoubleNode
{
	protected char data;
	protected DoubleNode next;
	protected DoubleNode prev;
	
	public DoubleNode()
	{
		data = ' ';
		next =null;
		prev = null;
	}//end constructor
	public DoubleNode(char letter)
	{
		data =letter;
	}//end constructor pass argument 
	public char getCharDL()
	{
		return data;
	}//end get data method
	public DoubleNode getLinkDL()
	{
		return next;
	}//end getLinkL
}//end class node for double
