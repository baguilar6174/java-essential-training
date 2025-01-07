package algorithms;

public final class StringsAlgorithms {

    public static boolean isUpperCase(String text) {
        return text.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String text) {
        return text.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isPasswordComplex(String text) {
        return text.chars().anyMatch(Character::isUpperCase) && text.chars().anyMatch(Character::isLowerCase) && text.chars().anyMatch(Character::isDigit);
    }

    public static String normalize(String text) {
        return text.toLowerCase().trim().replace(",", "");
    }

    public static boolean isAtEvenIndex(String text, char c) {
        if(text == null || text.isEmpty()) return false;
        for(int i = 0; i < text.length() / 2 + 1; i = i+2) {
            if(text.charAt(i) == c) return true;
        }
        return false;
    }

    public static String reverse(String text){
        /*
        // Option 1
        if(text == null || text.isEmpty()) return text;
        StringBuilder reversed = new StringBuilder(); // manage memory
        for(int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
         */

        // Option 2
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }
}
