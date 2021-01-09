package org.greens;

public class VowelsCount {
	
	public static void main(String[] args) {
		
		String s="welcome";
		int vowels=0;
		int nonvowels=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='U'||ch=='u') {
				vowels++;
			}
			else {
				nonvowels++;
				
			}
			
			
			
		}
			
	System.out.println(vowels);
System.out.println(nonvowels);
	}
	
	

}

