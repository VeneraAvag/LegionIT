public class Strings {
    public static void main(String[] args) {
        Strings strings = new Strings();

        strings.compareStrings("cat", "category");
        strings.compareStrings("basketball", "ball");
        strings.compareStrings(null, "category");
        strings.compareStrings("dog", "dog");

        System.out.println(strings.isPalindrome("kayak"));
        System.out.println(strings.isPalindrome(null));
    }
    public void compareStrings(String a, String b) {
        //Print if one string is part of another: "Cat is the part of Category"
        //If Strings are equal, the expected print is: "The Strings are the same"
        //If one of the strings is a null -  print: "Cannot compare Strings"
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        }
        else if (a.equals(b)) {
            System.out.println("The Strings are the same");
        }
        else if (a.contains(b)) {
            System.out.println(b + " is the part of " + a);
        }
        else if (b.contains(a)) {
            System.out.println(a + " is the part of " + b);
        }
    }
    public boolean isPalindrome(String text) {
        // code which will check if the text is palindrome or not.
        // return true if it is, false is it is not;
        String reversedText = "";
        if (text == null || text.isEmpty() || text.isBlank()) {
            System.out.println("The String is null or empty");
        }
        else {
            int lastLetter = text.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                reversedText += text.charAt(i);
            }
        }
        return (reversedText.equals(text));
    }

    public void test() {
        System.out.println("This is a test");
    }
}
