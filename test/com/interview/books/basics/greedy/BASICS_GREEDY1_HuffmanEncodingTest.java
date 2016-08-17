package com.interview.books.basics.greedy;

import java.util.Map;

import junit.framework.TestCase;

public class BASICS_GREEDY1_HuffmanEncodingTest  extends TestCase {
	
	public void testEncoding() {
		
		BASICS_GREEDY1_HuffmanEncoding huffmanEncoder = new BASICS_GREEDY1_HuffmanEncoding();
		Map<Character, String> actualMap = huffmanEncoder.getHuffmanCodes("aaaabcccc");
		assertEquals("0",actualMap.get('a'));
		assertEquals("10",actualMap.get('b'));
		
		actualMap = huffmanEncoder.getHuffmanCodes("aaaaabccc");
		assertEquals("1",actualMap.get('a'));
		assertEquals("00",actualMap.get('b'));
		assertEquals("01",actualMap.get('c'));
		
		actualMap = huffmanEncoder.getHuffmanCodes("a");
		assertEquals("1",actualMap.get('a'));
		assertEquals(null,actualMap.get('b'));
		
	}

}
