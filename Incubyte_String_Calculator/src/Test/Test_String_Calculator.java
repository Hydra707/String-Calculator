package Test;
import Main.String_Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class Test_String_Calculator 
{
	String_Calculator obj = new String_Calculator();
	@Test
	public void String_is_Empty() {
		assertEquals(obj.Add(""), 0);
	}
	public void Only_single_integer() {
		assertEquals(obj.Add("678"), 678);
	}

}
