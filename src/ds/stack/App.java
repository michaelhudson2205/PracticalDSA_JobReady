package ds.stack;

public class App
{

	public static void main(String[] args)
	{
//		Stack theStack = new Stack(3);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);
//		theStack.push(80);
		
//		while(!theStack.isEmpty())
//		{
//			long value = theStack.pop();
//			System.out.println(value);
//		}
		
		System.out.println(reverseString("Michael Hudson"));
		
	} // ==========end of psvm==========
	
	public static String reverseString(String str)
	{
		int stackSize = str.length();
		StringStack theStack = new StringStack(stackSize);
		for (int j = 0; j < str.length(); j++)
		{
			char ch = str.charAt(j);
			theStack.push(ch);
		}
		
		String result = "";
		while (!theStack.isEmpty())
		{
			char ch = theStack.pop();
			result += ch;
		}
		
		return result;
	}
}
