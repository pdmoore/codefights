package arcade.smoothsailing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseParenthesesTest {
    @Test
    public void NoParens_ReturnSameString() {
        String input = "Where are the parentheses?";
        String expected = input;
        assertEquals(expected, reverseParentheses(input));
    }

    @Test
    public void SingleParens_ReverseEverythingInside() {
        String input = "(abc)";
        assertEquals("cba", reverseParentheses(input));
    }

    @Test
    public void SingleParens_ConcatStringOutsideOfParens() {
        String input = "a(bc)de";
        assertEquals("acbde", reverseParentheses(input));
    }

    @Test
    public void NestedParens() {
        String input = "Code(Cha(lle)nge)";
        assertEquals("CodeegnlleahC", reverseParentheses(input));
    }

    @Test
    public void ConsecutiveParens() {
        String input = "abc(cba)ab(bac)c";
        assertEquals("abcabcabcabc", reverseParentheses(input));
    }

    private String reverseParentheses(String s) {
        int firstOpenParenIndex = s.indexOf('(');
        if (firstOpenParenIndex == -1) return s;

        int lastCloseParenIndex = s.lastIndexOf(')');
        int nextOpenParenIndex  = s.indexOf('(', firstOpenParenIndex + 1);
        int nextCloseParenIndex = s.indexOf(')', firstOpenParenIndex);
        if (lastCloseParenIndex != nextCloseParenIndex && nextCloseParenIndex < nextOpenParenIndex) {
            String simpleReverseString = s.substring(firstOpenParenIndex + 1, nextCloseParenIndex);
            String simpleReversed = new StringBuffer(simpleReverseString).reverse().toString();
            return reverseParentheses(s.substring(0, firstOpenParenIndex) + simpleReversed + s.substring(nextCloseParenIndex + 1));
        }

        String beforeParen = s.substring(0, firstOpenParenIndex);
        String afterParen  = s.substring(lastCloseParenIndex + 1);

        String stringBetweenParens = s.substring(firstOpenParenIndex + 1, lastCloseParenIndex);
        String reversed;
        if (stringBetweenParens.indexOf('(') >= 0) {
            reversed = reverseParentheses(stringBetweenParens);
            reversed = new StringBuffer(reversed).reverse().toString();
        } else {
            reversed = new StringBuffer(stringBetweenParens).reverse().toString();
        }

        return beforeParen + reversed + afterParen;
    }
}
