package org.test;

public class StringRev {
public static void main(String[] args) {
	String input = "hai welcome to java class";
	char[] c = input.toCharArray();
	for (int i = c.length-1; i >=0; i--) {
		System.out.print(c[i]);
	}
}
}
