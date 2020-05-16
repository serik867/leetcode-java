public class ValidPolindrom {
    public static boolean isPalindrome(String s) {
//        s=s.replaceAll("([^\\p{L}\\p{N}])", "").toLowerCase();
//        int low=0;
//        int high=s.length()-1;
//
//        while (low<high){
//            char lower=s.charAt(low);
//            char higher=s.charAt(high);
//
//            if (lower!=higher){
//                    return false;
//                }
//            low++;
//            high--;
//        }
//        return true;

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))){
                if (!Character.toString(s.charAt(left)).equalsIgnoreCase(Character.toString(s.charAt(right)))) {
                    return false;
                }
                left++;
                right--;
            }
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
