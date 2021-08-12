package Test;
import Main.String_Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class Test_String_Calculator 
{
	@Test
	public void String_is_Empty() {
		String_Calculator obj = new String_Calculator();
		assertEquals(obj.Add(""), 0);
	}

}
