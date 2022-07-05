package personalChallengers;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChallenger {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		System.out.println("Please, wirte someone word: ");
		String entryUser = in.next();
		printResult(entryUser);
		in.close();
	}
	
	public static void printResult(String word) {
		System.out.println(word + " is a palindrome? " + palindromeTest(word));
	}
	
	public static boolean palindromeTest(String word) {
		Stack<Character> pilha = new Stack<Character>();
		for(int i = 0; i < word.length(); i++) {
			pilha.push(word.charAt(i));
		}
		String wordInverse = "";
		while(!pilha.isEmpty()) {
			wordInverse += pilha.pop();
		}
		if(word.equalsIgnoreCase(wordInverse)) {
			return true;
		}
			return false;
		}

}
