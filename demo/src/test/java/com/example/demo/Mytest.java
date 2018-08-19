package com.example.demo;

import java.util.concurrent.ArrayBlockingQueue;

public class Mytest {
	private static final Object Integer = null;

	public static void main(String[] args) {
//		int[] arrays = { 6, -2, 12, 1, -1, 2, 11, 7, 9, 3, 4, 11, 5, -5, -4, 13, 10, 8, 0, -6, 19 };
//		arrays = quicksort1(0, arrays.length, arrays);
//		for (int i = 0; i < arrays.length; i++) {
//			System.out.println(arrays[i]);
//		}
		getLastOne(9);
	}

	public static int[] quicksort(int i, int j, int[] arrays) {
		if (j - i == 1) {
			return arrays;
		}
		if (i >= arrays.length) {
			return arrays;
		}
		int base = arrays[i];// 基准值
		int k = i;
		int length = j;
		for (--j; j > i; j--) {
			if (arrays[j] < base) {// 出现基准数右边的数比基准数小
				for (; k < length; k++) {
					if (k == j) {
						int temp = arrays[k];
						arrays[k] = arrays[i];
						arrays[i] = temp;

						// 对所有比基准数小的数快速排序

						quicksort(k + 1, length, arrays);

						// 对所有比基准数大的数快速排序
						quicksort(i, k, arrays);

						return arrays;

					} else if (arrays[k] > base) {
						int temp = arrays[k];
						arrays[k] = arrays[j];
						arrays[j] = temp;
						break;
					}
				}
			}
		}

		// 当基准数右边的数都比基准数大,对所有比基准数大的数快速排序
		return quicksort(i + 1, length, arrays);

	}
	
	public static int[] quicksort1(int i,int j,int [] array){
		if(j-i==1){
			return array;
		}
		if(i>=array.length){
			return array;
		}
		int base = array[i];
		int length = j;
		int k = i;
		//最右侧与基准值比较，拿到比基准值小的
		for(--j;j>i;j--){
			if(array[j]<base){
				for(;k<length;k++){
					if(array[k]>base){
						int temp = array[k];
						array[k] = array[j];
						array[j] = temp;
						break;
					}else if(k==j){
						int temp = array[k];
						array[k] = array[i];
						array[i] = temp;
						quicksort1(i,k,array);
						quicksort1(k+1,length,array);
						return array;
					}
				}
			}
		}
		return quicksort1(i+1,length,array);
	}
	
	public static int getLastOne(int num){
		ArrayBlockingQueue<String> q = new ArrayBlockingQueue<String>(5);
		q.offer("123");
		q.offer("1234");
		q.poll();
		for(String s:q){
			
		//	System.out.println(s);
		}
		String a [] = new String[2];
		a[1] = "5";
		for (String string : a) {
			System.out.println(string);
		}
		if(num==1){
			return num;
		}
		if(num%3==0){
			
		}
		return 0;
	}
}
