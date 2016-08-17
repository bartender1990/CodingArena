package com.interview.books.basics.greedy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Encode and decode using Huffman encoding and decoding. Uses a priority heap
 * to delete an element from the heap which has minimum priority.
 * 
 * Priority Queue in java gives the smallest element based on the comparator
 * provided. This is used to collate the smallest items in the queue every-time.
 * Initially the queue will have the the element occurring the least number of
 * times in the string at the top.
 * 
 * When we dequeue this and the second least occurring item and merge them this
 * entry is again pushed back in the queue at the correct order.The cycle goes
 * on till we have just one item left in the priority queue.To distinguish
 * between the original elements and the elements we just pushed back in the
 * queue by merging two elements, we keep the char as sentinel '$', which is
 * used traversing back the queue.
 * 
 * While going left on the final queue, we append a "0", and while going right,
 * we append a "1" to the string and recurse down.
 * 
 * http://www.geeksforgeeks.org/greedy-algorithms-set-3-huffman-coding/
 * http://codereview.stackexchange.com/questions/44473/huffman-code-implementation
 * 
 * @author prakhar
 */
public class BASICS_GREEDY1_HuffmanEncoding {

	public BASICS_GREEDY1_HuffmanEncoding() {
	}

	/**
	 * Since constructors are not inherited, Having copy constructors in
	 * inheritance chain is the preferred way but copy constructors can hide a
	 * lot of compile time violations while re-factoring,because of type-casts
	 * silently choosing the copy constructor.
	 * 
	 * Try creating a HeapElem having c,freq as its members and TreeNode
	 * extending it.
	 * 
	 * @author prakhar
	 *
	 * @param <T>
	 *            : Long, Integer the type parameter for expressing the
	 *            frequency.
	 */
	private class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>> {

		TreeNode<T> left;
		TreeNode<T> right;
		Character c;
		T freq;

		TreeNode(Character c, T freq) {
			this.c = c;
			this.freq = freq;
		}

		TreeNode(T value) {
			freq = value;
		}

		@Override
		public int compareTo(TreeNode<T> o) {
			return freq.compareTo(o.freq);
		}

	}

	/**
	 * Creates a hashMap to assign the string codes to each character. Be
	 * careful while dealing with character as hashmap keys, as
	 * roo.c.equals("S") is also valid java in below code, because of the equals
	 * definition for {@link Character} taking an {@link Object} and not just
	 * another character.
	 * 
	 * @param root
	 * @param s
	 * @param map
	 */
	private void printCodes(TreeNode<Long> root, String s, Map<Character, String> map) {
		if (root == null)
			return;
		if (!root.c.equals('$')) {
			map.put(root.c, s);
			return;
		} else {
			printCodes(root.left, s + "0", map);
			printCodes(root.right, s + "1", map);
		}
	}

	/**
	 * Use of getOrDefault saves the usual if conditions. charAt returns the
	 * primitive character which is boxed when inserting to HashMap
	 * 
	 * @param sentence
	 * @return
	 */
	private static Map<Character, Long> getCharFrequency(String sentence) {
		final Map<Character, Long> map = new HashMap<Character, Long>();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			Long freq = map.getOrDefault(ch, 0l);
			map.put(ch, freq + 1);
		}

		return map;
	}

	/**
	 * Stream operations to save the usual looping construct. Remember to use
	 * the correct type-casting
	 * 
	 * @param s
	 * @return
	 */
	public Map<Character, String> getHuffmanCodes(String s) {
		List<TreeNode<Long>> alphabets;
		Map<Character, Long> freqMap = getCharFrequency(s);
		Set<Entry<Character, Long>> entrySet = freqMap.entrySet();
		alphabets = entrySet.parallelStream().map(i -> new TreeNode<Long>(i.getKey(), i.getValue()))
				.collect(Collectors.toList());
		return build(alphabets);
	}

	/**
	 * 
	 * @param alphabets
	 * @return
	 */
	private Map<Character, String> build(List<TreeNode<Long>> alphabets) {

		PriorityQueue<TreeNode<Long>> hp = new PriorityQueue<>(alphabets);
		Map<Character, String> map = new HashMap<>();

		// corner case
		if (hp.size() == 1) {
			map.put(alphabets.get(0).c, "1");
			return map;
		}

		// PreCondition : heap size = alphabet size
		while (hp.size() != 1 && hp.size() >= 2) {

			TreeNode<Long> first = hp.remove();
			TreeNode<Long> second = hp.remove();

			Long rootValue = first.freq + second.freq;
			TreeNode<Long> root = new TreeNode<Long>(rootValue);
			root.left = first;
			root.right = second;
			root.c = '$';
			hp.offer(root);

		}

		printCodes(hp.remove(), "", map);
		return map;

	}

}
