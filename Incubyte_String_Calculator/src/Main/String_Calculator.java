package Main;

public class String_Calculator {
	public int Add(String numbers)
	{
		int result = 1;
		if(numbers.isEmpty())
			result = 0;
		else
			result =Integer.parseInt(numbers);
		return result;
	}

}
