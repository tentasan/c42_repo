package com.tnisf.day1;



public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123567;
		int rev = 0;
		int count=0;
		while(num!=0) {
		rev=num%10;
		num/=10;
		count++;
		}
		System.out.println(count);
	}
   
}
