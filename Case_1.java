package com.preboarders;

import java.util.Scanner;

public class Case_1 {
	
	public boolean unique_Strings(String a) {
		for(int i = 0; i < a.length(); i++) {
			for(int j = i+1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Hello Testing...");
			Case_1 obj = new Case_1();
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the new String - ");
				String str = sc.nextLine(); 
				
				if (obj.unique_Strings(str)) {
					System.out.println("True");
				}
				else {
					System.out.println("False");
				}
			}
	}

}

