package co.simplon.camelcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CamelCaseTest {

	@Test
	public void shouldReturnNotingIfNullOrEmpty() {
		assertEquals("", CamelCase.camelCase(null));
		assertEquals("", CamelCase.camelCase(""));
	}
	
	@Test
	public void shouldReturnUpperCaseIfOnlyOneLetter() {
		assertEquals("A", CamelCase.camelCase("a"));
	}
	
	@Test
	public void shouldReturnWordWithFirstLetterUpper() {
		assertEquals("Hello", CamelCase.camelCase("hello"));		
	}
	
	@Test
	public void shouldReturnWordWithOnlyFirstLetterUpper() {
		assertEquals("Hello", CamelCase.camelCase("heLLo"));
	}

	@Test
	public void shouldRemoveSpaces() {
		assertEquals("HelloWorld", CamelCase.camelCase(" HeLLo World "));	
	}
}
