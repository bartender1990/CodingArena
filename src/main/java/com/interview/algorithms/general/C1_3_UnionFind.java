package com.interview.algorithms.general;

/**
 * Created_By: zouzhile
 * Date: 4/8/14
 * Time: 9:20 AM
 * <p/>
 * See: http://algs4.cs.princeton.edu/15uf/
 * <p/>
 * The implementation is actually Weighted quick-union version
 */

public class C1_3_UnionFind {

    private int N = 0;
    private int[] parents;
    private int[] unionSizes;
    private int unionsCount;

    public void reset() {
        for (int i = 0; i < N; i++)
            parents[i] = i;
        for (int i = 0; i < N; i++)
            unionSizes[i] = 1;
        this.unionsCount = N;
    };

    public C1_3_UnionFind(int N) {
        this.N = N;
        parents = new int[N];
        unionSizes = new int[N];

        this.reset();

    }

    /**
     * This is actually returning the root of the union
     *
     * @param p
     * @return
     */
    public int find(int p) {
        while (p != this.parents[p])
            p = this.parents[p];
        return p;
    }

    /**
     * Recursively returns the root of the union
     * 
     * 
     * @param p
     * @return
     */
    public int recursiveFind(int p) {
        if (this.parents[p] == p)
            return p;
        else
            return recursiveFind(parents[p]);
    }

    public boolean connected(int p, int q) {
        return this.find(p) == this.find(q);
    }

    /**
     * Weighted quick union
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pRoot = this.find(p);
        int qRoot = this.find(q);
        if (pRoot == qRoot)
            return;
        if (unionSizes[pRoot] < unionSizes[qRoot]) { // attaching small union to large union
            this.parents[pRoot] = qRoot;
            this.unionSizes[qRoot] += this.unionSizes[pRoot];
        } else {
            this.parents[qRoot] = pRoot;
            this.unionSizes[pRoot] += this.unionSizes[qRoot];
        }
        this.unionsCount--;
    }

    /**
     * This will lead to O(n) in worst case
     * 
     * @param p
     * @param q
     */
    public void badUnion(int p, int q) {
        int pRoot = this.recursiveFind(p);
        int qRoot = this.recursiveFind(q);
        // this is required for consistency of unionSizes and unionsCount
        if (pRoot == qRoot)
            return;
        this.parents[pRoot] = qRoot;
        this.unionSizes[qRoot] += this.unionSizes[pRoot];
        this.unionsCount--;
    }

    public int count() {
        return this.unionsCount;
    }

    public static void main(String[] args) {
        C1_3_UnionFind c1_3_UnionFind = new C1_3_UnionFind(5);
        int[][] edges = { { 0, 2 }, { 1, 0 }, { 3, 4 }, { 4, 1 } };
        for (int[] edge : edges)
            c1_3_UnionFind.union(edge[0], edge[1]);
        System.out.println(c1_3_UnionFind.unionsCount);
        for (int i = 0; i < c1_3_UnionFind.N; i++) {
            System.out.println("------");
            System.out.println(" element = " + i + " parent = " + c1_3_UnionFind.parents[i]);
        }
        System.out.println("\nUNOPTIMIZED UNION FIND\n");
        c1_3_UnionFind.reset();
        for (int[] edge : edges)
            c1_3_UnionFind.badUnion(edge[0], edge[1]);
        System.out.println(c1_3_UnionFind.unionsCount);
        for (int i = 0; i < c1_3_UnionFind.N; i++) {
            System.out.println("------");
            System.out.println(" element = " + i + " parent = " + c1_3_UnionFind.parents[i]);
        }

    }
}
