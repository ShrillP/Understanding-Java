package Recursion;

import java.util.Scanner;

public class Palindromes {
	
	public static String newWord , originalWord;
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		originalWord = input.nextLine();
		
		newWord = removePunctuation(originalWord);
		isPalindrome(0 , newWord.length() - 1);
		
	}
	
	public static String removePunctuation (String phrase) {
	
		for (int x = 0; x < phrase.length(); x++) {
		
			if (phrase.charAt(x) >= 65 && phrase.charAt(x) <= 90 || phrase.charAt(x) >= 97 && phrase.charAt(x) <= 122) {
			
				newWord += phrase.toLowerCase().charAt(x);
				
			}
		}
		
		return newWord;
	}
	
	public static void isPalindrome (int left, int right) {
	
		if (newWord.charAt(left) >= newWord.charAt(right))
			System.out.printf("\"%s\" is a palindrome", originalWord);
		else if (newWord.charAt(left) != newWord.charAt(right))
			System.out.printf("\"%s\" is not a palindrome", originalWord);
		else 
			isPalindrome(++left , --right);
		
	}	
}