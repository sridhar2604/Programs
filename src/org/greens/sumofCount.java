package org.greens;

public class sumofCount {
public static void main(String[] args) {
	int count=0;
	for (int i = 1; i <=20; i++) {
		if (i%2==0) {
			count=count+i;
		}
		}
	System.out.println("Print the count");
	System.out.println(count);
}

}
