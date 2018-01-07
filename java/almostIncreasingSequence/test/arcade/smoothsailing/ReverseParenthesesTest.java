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
        // need logic for nested (feels like recursion) -- "Code(Cha(lle)nge)" ==> "CodeegnlleahC"
        // vs consecutive paren sets -- "abc(cba)ab(bac)c" ==> "abcabcabcabc"

        String input = "Code(Cha(lle)nge)";
        assertEquals("CodeegnlleahC", reverseParentheses(input));
    }

    private String reverseParentheses(String s) {
        int firstParenIndex = s.indexOf('(');
        if (firstParenIndex == -1) return s;

        int lastParenIndex = s.lastIndexOf(')');

        String beforeParen = s.substring(0, firstParenIndex);
        String afterParen  = s.substring(lastParenIndex + 1);

        String stringBetweenParens = s.substring(firstParenIndex + 1, lastParenIndex);
        String reversed = "";
        if (stringBetweenParens.indexOf('(') >= 0) {
            reversed = reverseParentheses(stringBetweenParens);
            reversed = new StringBuffer(reversed).reverse().toString();
        } else {
            reversed = new StringBuffer(stringBetweenParens).reverse().toString();
        }

        return beforeParen + reversed + afterParen;
    }
}
