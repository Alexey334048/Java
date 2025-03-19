package task5;

public class Main {
    public static void main(String[] args) {
        String input = "Если есть хвосты по дз, начните с 1 несданного задания. 123 324 111 4554";
        String[] words = input.split("\\W+");

        boolean foundPalindrome = false;

        for (String word : words) {
            if (isNumeric(word) && isPalindrome(word)) {
                System.out.println("Найдено слово-палиндром: " + word);
                foundPalindrome = true;
            }
        }

        if (!foundPalindrome) {
            System.out.println("Слов-палиндромов не найдено.");
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}