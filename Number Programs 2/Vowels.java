//check whether character is vowel or consonent

import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char vowel = S.next().charAt(0);
		String ans = (vowel == 'a'|| vowel =='e' || vowel == 'i' || vowel == 'o' || vowel == 'u'||vowel == 'A'|| vowel =='E' || vowel == 'I' || vowel == 'O' || vowel == 'U')?("Is vowel."):("Is consonent.");
		System.out.println("Entered character "+vowel+" is "+ans);
	}
}