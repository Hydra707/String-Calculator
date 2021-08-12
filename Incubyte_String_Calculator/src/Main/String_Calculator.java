package Main;

public class String_Calculator {
	public int Add(String numbers)
	{
		String[] arr = numbers.split(",");
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
			result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
		}
		return result;
	}

}
