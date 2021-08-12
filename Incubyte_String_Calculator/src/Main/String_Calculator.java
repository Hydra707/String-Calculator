package Main;

public class String_Calculator {
	public int Add(String numbers)
	{
		int result = 1;
		if(numbers.isEmpty())
			result = 0;
		else 
		{
			String[] arr = numbers.split(",");
			result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
		}
		return result;
	}

}
