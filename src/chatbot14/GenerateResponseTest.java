package chatbot14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class GenerateResponseTest {

	@Test
	void testTransformKeywords() {
		String words1 = "how do you feel";
		String[] words1i = words1.split(" ");
		String[] actual = GenerateResponse.transformKeywords(words1i);
		String[] expected = "what do i feel".split(" ");
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testSearchKeywords() {
		String words1 = "you are funny because everyone says you are";
		Stack<Integer> actual = GenerateResponse.searchKeywords(words1.split(" "));
		assertEquals(actual.pop(),new Integer(4)); // should be expected, then the actual value, but it's reversed in this method
		assertEquals(actual.pop(),new Integer(2));
		assertEquals(actual.pop(),new Integer(0));
		assertEquals(actual.pop(),new Integer(0));
	}
	
	@Test
	void testCombineSentence() {
		String[] words = {"have","a","bone"};
		String actual = GenerateResponse.combineSentence(words);
		String expected = "have a bone";
		assertEquals(expected, actual);
	}
	
	@Test
	void testApplyPatternAndGetResponse() {
		
	}

}
