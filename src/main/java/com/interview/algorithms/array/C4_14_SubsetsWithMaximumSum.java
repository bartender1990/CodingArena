package com.interview.algorithms.array;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.geeksforgeeks.org/forum/view/company-interview?company=146
 * Given a set S, find all the maximal subsets whose sum <= k. For example, if S = {1, 2, 3, 4, 5} and k = 7
 * Output is: {1, 2, 3} {1, 2, 4} {1, 5} {2, 5} {3, 4}
 * 
 * @author zouzhile
 *
 */
public class C4_14_SubsetsWithMaximumSum {

  /**
   * 
   * @param sortedSet an array containing the unique and sorted positive integer
   * @param k the max sum of the subset' elements
   */
  
  public List<List<Integer>> findSubsets(int[] sortedSet, int k) {
    List<List<Integer>> rst = new ArrayList<List<Integer>>();
    List<Integer> path = new ArrayList<Integer> ();
    dfs(rst, path, sortedSet, 0, 0, 0, k);
    return rst;
  }
  
  public void dfs (List<List<Integer>> rst, List<Integer> path, int[] sortedSet,
                   int index, int sum, int min, int k) {
    if (sum > k) {
      return;
    }
    if (index == sortedSet.length) {
      if ( sum + min > k) {
        rst.add(new ArrayList<Integer> (path));
      }
      return;
    }

    path.add(sortedSet[index]);
    dfs(rst, path, sortedSet, index + 1, sum + sortedSet[index], min, k);  
    path.remove(path.size() - 1);
    min = min == 0 ? sortedSet[index] : min;
    dfs(rst, path, sortedSet, index + 1, sum, min, k);      
  }
	
	
	public static void main(String[] args) {
		int[] set = {1, 2, 3, 4, 5};
		int k = 7;
		List<List<Integer>> maxSubsets = new C4_14_SubsetsWithMaximumSum().findSubsets(set, k);
		for(List<Integer> subset : maxSubsets) {
			for(Integer v : subset) 
				System.out.print(v + "\t"); 
			System.out.println();
		}
	}
}
