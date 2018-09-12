import java.util.Scanner;

public class Hello {

	public static void GetString()
	{
		
		System.out.println("Please input the monney you want: :" );
		Scanner getIn = new Scanner(System.in);
		String str = getIn.nextLine();
		System.out.println(str);
		
	}
	
	public static void PrintLog()
	{
		System.out.println("Test the print the log");
	}
	
	public static void LearnFirstLesson()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the monney you want: :" );
		
		int monney = in.nextInt();
		final int data = 20;
		System.out.println(monney >= 10);
		
		if(monney >= data)
		{
			System.out.println("The input larger than the data," + monney);
		}
		else 
		{
			System.out.println("Small data," + monney);
		}
		
		System.out.println("result:" +( monney - 10));
		
		int [] numbers = new int [10];
		for(int i = 0;i< 10;i++)
		{
			numbers[i] = i*10;
			System.out.println(numbers[i]);
		}
	}

	public static void Array()
	{
		/*
		 * container,style,can not change the size
		 * Java has the ability to check the boundary
		 */
		int [] numbers = new int[10];
		int [] scores = {90,55,30};
		for (int i=0;i<numbers.length;i++)
		{
			numbers[i]=i;
		}
	}
	
	public static void LearnObject()
	{
		Integer k = 10;
		System.out.println("value:"+k);
		System.out.println(Character.isDigit(k));
	}
	
	public static void LearnString()
	{
		/*
		 * String as Array
		 * compareTo,equals,length()
		 * s.charAt(index)
		 * s.substring(n)
		 * 
		 */
		
		String str = new String("Hello String ,test");
		System.out.println(str+12+24);
		Scanner in = new Scanner(System.in);
		String str2 = new String();
		str2 = in.nextLine();
		System.out.println(str2);
	}
	
	/*
	 * Main function start now
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello wrorld ");

		
		PrintLog();
		LearnObject();
		LearnString();
	}

}
