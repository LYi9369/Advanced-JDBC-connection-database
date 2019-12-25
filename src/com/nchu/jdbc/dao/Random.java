package com.nchu.jdbc.dao;

public class Random {
	public static void main(String[] args) {

		/*
		 * int start = 21,i=0; int rand = (int) (Math.random() * 3 + start);
		 * 
		 * while (rand >= start || rand <= 23) { if(i>2){ break; }
		 * System.out.println(rand); i += 1; }
		 */
	}

	public int[] RandArr(int count) {
		int arr[] = new int[count];
		// Random random = new Random();
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
//			arr[i] = random.nextInt(count);
		}

		return arr;
	}
}
