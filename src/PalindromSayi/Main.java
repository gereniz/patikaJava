package PalindromSayi;

import java.util.Scanner;

public class Main {

	
	static boolean isPalindrom(int number) {
		int temp = number,reverseNumber = 0 ,lastNumber;
		
		while(temp != 0 ) {
			lastNumber = temp%10;
			reverseNumber = (reverseNumber*10) + lastNumber;
			temp/=10;
		}
		if(reverseNumber == number) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayı giriniz : ");
		int number = input.nextInt();
		if(isPalindrom(number)) {
			System.out.println(number + " palindrom sayıdır");
		}else {
			System.out.println(number + " palindrom sayı değildir");
		}
	}
}
