package org.evenoddnumbers;

import java.util.Iterator;

public class A {

	public static void main(String[] args) {
		
		int oddcount = 0;
		int evencount = 0;
		System.out.println("ODD");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				oddcount++;
				}
		}
			System.out.println("EVEN");
			for (int j = 0; j < 50; j++) {
				if (j%2==0) {
					System.out.println(j);
					evencount++;
				}
			}
			int sum = oddcount+evencount;
			System.out.println("sum of counts : "+sum);
			System.out.println("oddcount : "+oddcount +"\n"+ "evencount : "+evencount);
			System.out.println();
			
			}
		}
	 
		
		
		
		
		
	
	

