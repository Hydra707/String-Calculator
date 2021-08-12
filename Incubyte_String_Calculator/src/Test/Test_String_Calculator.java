package Test;
import Main.String_Calculator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_String_Calculator 
{
	String_Calculator obj = new String_Calculator();
	@Test
	public void String_is_Empty() throws Exception {
		assertEquals(obj.Add(""), 0);
	}
	@Test
	public void Only_single_integer() throws Exception {
		assertEquals(obj.Add("678"), 678);
	}
	@Test
	public void Double_integer() throws Exception {
		assertEquals(obj.Add("1,2"), 3);
	}
	@Test
	public void Unknown_numbers() throws Exception {
		assertEquals(obj.Add("14,7,4,0,90"), 115);
	}
	@Test
	public void NewLine_Between_numbers() throws Exception {
		assertEquals(obj.Add("1,2\n3"), 6);
	}
	@Test
	public void Default_Delimiter() throws Exception {
		assertEquals(obj.Add("//;\n1;2"), 3);
	}
	public void Exception_Negative() throws Exception {
		obj.Add("-3,5,-9");
	}
}
