package Task3;

public class isPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindromeFirstMethod("KhK"));
        System.out.println(isPalindromeSecondMethod("K h k K h k "));


    }

    public static boolean isPalindromeFirstMethod(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }


        return true;
    }

    public static boolean isPalindromeSecondMethod(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char characterLeft = s.charAt(i);
            char characterRight = s.charAt(j);

            if (!Character.isLetterOrDigit(characterLeft)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(characterRight)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(characterLeft) != Character.toLowerCase(characterRight)) {
                return false;
            }

            i++;
            j--;

        }

        return true;
    }


}
