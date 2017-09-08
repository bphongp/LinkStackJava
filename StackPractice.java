package homework7;

import java.io.*;
import java.util.EmptyStackException;

public class StackPractice
{
	private static char stackChar[];
	private static int top;
	protected int lengthWord;
	
	public StackPractice()
	{
		stackChar = new char[lengthWord];
		top = -1;
	}//constructor to initialize stack
	public void enterChar() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		System.out.println("Please enter a word (6-8) char");
		str =br.readLine();
		stackChar= str.toCharArray();
		lengthWord = str.length();
	}//end enterChar method
	private void push(char c)
	{
		if(top+1>=lengthWord)
			System.out.println("The stack is full");
		else
		{
			top++;
			stackChar[top]=c;
		}//end else
	}//end push method
	public char pop()
	{
		char c;
		if(top<0)
			throw new EmptyStackException();
		else 
			c = stackChar[top];
		top--;
		return(c);
	}//end pop method
	public boolean empty()
	{
		if(top<0)
			return(true);
		else
			return(false);
	}//end empty method
	public char peek()
	{
		char c;
		if(top<0)
			throw new EmptyStackException();
		else
		{
			c = stackChar[top];
			return(c);
		}//end else
	}//end peek method
	public void pushMethod()
	{
		for(int i =0;i<lengthWord;i++)
		{
			push(stackChar[i]);
		}//for loop to push each char to Stack
	}//end pushmethod
	public void popMethod()
	{
		for(int i =0;i<lengthWord;i++)
		{
			pop();
		}//end pop for loop
	}//end pop method
	public void reverse()
	{
		String stackword = "";
		while(top !=-1)//while not top stack
			stackword+=this.pop();//take out letter and add onto string
		for(int i=0; i <=lengthWord-1;i++)
		{
			stackChar[i]= stackword.charAt(i);
			push(stackChar[i]);
		}//end for loop for reverse
	}//end reverse method
	public void printOut()
	{
		System.out.print("Stack (bottom to top): ");
		if(top ==-1)
		{
			System.out.print("Empty\n");
		}//end if statement
		else
		{
			for(int i =0;i<=top;i++)
			{
				System.out.print(stackChar[i]);
			}//print out stack
			System.out.println();
		}//end else
	}//end printOut method
}//end class StackPractice
