package com.simplilearn.sparsetable;

public class SparseTableDemo {

	
	//reference link: https://cp-algorithms.com/data_structures/sparse-table.html
	int MAXN=100000;
	int K=16;
	long table[][]= new long [MAXN][K + 1];
	
	public void buildSparseTable(int array[], int N) {
		
		for (int i = 0; i < N; i++)
		    table[i][0] = array[i];

		for (int j = 1; j <= K; j++)
		    for (int i = 0; i + (1 << j) <= N; i++)
		        table[i][j] = table[i][j-1]+ table[i + (1 << (j - 1))][j - 1];

		
	}
	
	long rangeQuery(int L, int R) {
		
		long sum=0;
		for (int j = K; j >= 0; j--) {
		    if ((1 << j) <= R - L + 1) {
		        sum += table[L][j];
		        L += 1 << j;
		    }
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8,9};
		
		SparseTableDemo demo= new SparseTableDemo();
		demo.buildSparseTable(array, array.length);
		System.out.println("Sum between oth and 5th index is: "+demo.rangeQuery(0, 5));
		System.out.println("Sum between 3rd and 8th index is: "+demo.rangeQuery(3, 8));
		
		
	}
	
	
	
}
