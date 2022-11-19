package mutable_immutable;

public class ReverseString {

    public static void main(String[] args) {

        String str1 = "Good morning";
        String str2 = "Hello";
        String str3 = "1234";

        System.out.println(reverseString(str1));
        System.out.println(reverseString(str2));
        System.out.println(reverseString(str3));

        str1 = "civic";
        str2 = "madam";
        str3 = "hello";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));

    }


    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        // return new StringBuilder(str).reverse().toString().equals(str);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
