package com.company;

public class Main {

    public static void main(String[] args) {
	int vCount = 0;
	String a = "It is Friday";
	a = a.toLowerCase();
	for(int i = 0; i < a.length(); i++) {
	    if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
	        vCount++;

        }

    }
        System.out.println("There are " + vCount + " vowels in the string.");

    }
}
