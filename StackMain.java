package homework7;
import java.io.*;
/*Program will implement stack by array and linked list
 * by reversing a word
 */
public class StackMain
{ 	
	public static void main(String[] args) throws IOException
	{
		char[] linkArray;
		int lengthWord;
		String str;
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		StackPractice s1 = new StackPractice();//create obj for stack array
		LinkListStack lls = new LinkListStack();///create obj for linked list
		DoubleLinked dl = new DoubleLinked();
		
		//implementation for stack using arrays
		s1.enterChar();
		s1.pushMethod();
		s1.printOut();
		System.out.println("Top of Stack: "+s1.peek());
		s1.popMethod();
		s1.printOut();
		s1.pushMethod();
		s1.reverse();
		s1.printOut();
		System.out.println("Top of Stack: "+s1.peek());

		//linked list implementation
		System.out.println("Please enter a word (6-8) char");
		str =br1.readLine();
		linkArray= str.toCharArray();
		lengthWord = str.length();
		for(int i=0;i<=lengthWord-1;i++)
		{
			lls.pushL(linkArray[i]);
		}//end for loop that uses push method for linked
		lls.outputLink();
		System.out.println("Top of Stack: "+lls.peekL());//test peek method
		for(int i=0;i<lengthWord;i++)
		{
			lls.popL();
		}//end for loop that uses pop method
		lls.outputLink();
		for(int i=lengthWord-1;i>=0;i--)
		{
			lls.pushL(linkArray[i]);
		}//ends add back on word in reverse
		lls.outputLink();
		System.out.println("Top of Stack: "+lls.peekL());//test peek method
		
		//double linked list implementation
		System.out.println("Please enter a word (6-8) char");
		str =br1.readLine();
		linkArray= str.toCharArray();
		lengthWord = str.length();
		for(int i=0;i<=lengthWord-1;i++)
		{
			dl.pushDL(linkArray[i]);
		}//end for loop that uses push method for linked
		dl.outputDList();
		System.out.println("Top of Stack: "+dl.peekDL());//test peek method
		for(int i=0;i<=lengthWord-1;i++)
		{
			dl.popDL();
		}
		dl.outputDList();
		for(int i = lengthWord-1 ; i>=0;i--)
		{
			dl.pushDL(linkArray[i]);
		}
		dl.outputDList();
		System.out.println("Top of Stack: "+dl.peekDL());//test peek method
	}//end main
}//end class for Stack Main
