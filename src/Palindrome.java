class Palindrome {
    void isPalindrome(String str) {
        String strL = str.toLowerCase();
        int i = 0, j = str.length() - 1;

        while(i < j) {
            if(strL.charAt(i) != strL.charAt(j)) {
                System.out.println(str + " is not a palindrome");
                return;
            }

            i++;
            j--;
        }

        System.out.println(str + " is a palindrome");
    }
}

class PalindromeMain {
    public static void main(String[] args) {
        String str1 = "Malayalam";
        String str2 = "English";

        Palindrome p = new Palindrome();

        p.isPalindrome(str1);
        p.isPalindrome(str2);
    }
}
