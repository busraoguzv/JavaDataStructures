package PalindromeChecker;

public class palindromeDemo {
    public static void main(String[] args){
        String test1="Ankara06";
        String test2="ata";
        String test3="45lkykl54";
        System.out.println("Is \""+test1+"\" palindrome?: "+PalindromeChecker.isPalindrome(test1));
        System.out.println("Is \""+test2+"\" palindrome?: "+PalindromeChecker.isPalindrome(test2));
        System.out.println("Is \""+test3+"\" palindrome?: "+PalindromeChecker.isPalindrome(test3));
    }
}
