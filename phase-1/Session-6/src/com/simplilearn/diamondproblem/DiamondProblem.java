package com.simplilearn.diamondproblem;

public class DiamondProblem implements First,Second {
	
	public void show() {
		 First.super.show();
		 Second.super.show();
	}
	
	public static void main(String[] args) {
		
		DiamondProblem dp= new DiamondProblem();
		dp.show();
		
	}

}
