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
		//assertEquals(actual.pop(),new Integer())
	}

}
