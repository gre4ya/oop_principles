package mutable_immutable;

public class Exercise_01 {

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "a";
        String str3 = "aa";
        String str4 = "aaa";
        String str5 = "aaaa";
        String str6 = "aaaaa";
        String str7 = "aaaaaa";

        System.out.println(insertAstrix(str1));
        System.out.println(insertAstrix(str2));
        System.out.println(insertAstrix(str3));
        System.out.println(insertAstrix(str4));
        System.out.println(insertAstrix(str5));
        System.out.println(insertAstrix(str6));
        System.out.println(insertAstrix(str7));
    }

    public static String insertAstrix(String str) {
      if (str.length() <= 1)
        return str;
      if (str.length() % 2 == 0)
        return new StringBuilder(str).insert(str.length() / 2, "*").toString();
      else
        return new StringBuilder(str).insert(str.length() / 2, "*").insert(str.length() / 2 + 2, "*").toString();
    }
}
