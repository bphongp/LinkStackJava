package homework7;
public class Node
{
	protected Node next;
	protected char ch;
	public Node()
	{
		next = null;
		ch= ' ';
	}//end of constructor
	public Node(char data, Node link)
	{
		ch = data;
		next = link;
	}//end constructor take in
	public void setLink(Node newLink)
	{
		next = newLink;
	}//end setLink
	public Node getLinkL()
	{
		return next;
	}//end getLinkL
	public char getCharL()
	{
		return ch;
	}//ed get char method
}//end class StackLink
