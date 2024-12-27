import java.util.function.Predicate;

public class LambdaExercise {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = val -> {
            for (int i = 0; i < val / 2; i++) {
                if (val % i == 0)
                    return false;
            }
            return true;
        };

        Predicate<String> isPalindrome = (str) -> {
            int n = str.length();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) != str.charAt(n - i - 1))
                    return false;
            }
            return true;
        };

        Predicate<String> validParanthesis = (str) -> {
            // Stack<Character> s;
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (curr == '(' || curr == '[' || curr == '{') {
                    // s.push(curr);
                } else {
                    if (curr == ')') {

                    }
                }
            }
            return true;
        };
        System.out.println(isPrime.test(5));
        System.out.println(isPalindrome.test("abcba"));
        System.out.println(validParanthesis.test("([{}])"));
    }
}
