package Main;

public class String_Calculator {
	public int Add(String numbers) throws Exception
	{
		String[] arr = Chop_String(numbers,",|\n");
		int result = 1;char ch = ',';
		if(numbers.isEmpty())
		{
			result = 0;
		}
		else if(arr.length == 1)
		{
			result = Integer.parseInt(numbers);
		}
		else if(numbers.startsWith("//")) 
		{
			String[] body = numbers.split("\n", 2);
			String delimiter = body[0].substring(2); 
			numbers = body[1];
			result = add_array(Array_Conversion(Chop_String(numbers, delimiter)));
		}
		else
		{
			result = add_array(Array_Conversion(arr));
		}
		return result;
	}
	private static String[] Chop_String(String num, String delimiter) 
	{
		String [] arr = num.split(delimiter);
		return arr;
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
	private static int add_array(int Arr[]) throws Exception
	{
		String str = "";
		for(int itr : Arr) {
			if(itr<0) {
				str = str+ " " + String.valueOf(itr) + " ";
			}
		}
		if(str!="") {
			throw new RuntimeException("negatives not allowed" + str);
		}
		int sum = 0;
		for(int i=0;i<Arr.length;i++) 
		{
			sum = sum + Arr[i];
		}
		return sum;
	}
}
