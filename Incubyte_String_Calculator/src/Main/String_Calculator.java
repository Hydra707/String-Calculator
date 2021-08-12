package Main;

public class String_Calculator {
	public int Add(String numbers)
	{
		String[] arr = numbers.split(",|\n");
		int result = 1;char ch = ',';
		if(numbers.isEmpty())
		{
			result = 0;
		}
		else if(arr.length == 1)
		{
			result = Integer.parseInt(numbers);
		}
		else
		{
			result = add_array(Array_Conversion(arr));
		}
		return result;
	}
	private static int[] Array_Conversion(String Sarr[]) 
	{
		int[] Iarr = new int[Sarr.length];
		
		for(int i=0;i<Iarr.length;i++) 
		{
			Iarr[i] = Integer.parseInt(Sarr[i]);
			}
		return Iarr;
	}
	private static int add_array(int Arr[]) 
	{
		int sum = 0;
		for(int i=0;i<Arr.length;i++) 
		{
			sum = sum + Arr[i];
		}
		return sum;
	}
}
