package io.keede7.model.pattern;

import java.util.regex.Pattern;

import static io.keede7.model.expression.BasicCharacterExpression.*;

/**
* @author keede
* Created on 2024/03/08
*/
public final class BasicCharacterPattern {

    public static final Pattern ONLY_CHARACTER_PATTERN = Pattern.compile(combine(ONLY_CHARACTER));
    public static final Pattern NOT_ONLY_CHARACTER_PATTERN = Pattern.compile(combine(NOT_ONLY_CHARACTER));
    public static final Pattern ONLY_NUMBER_PATTERN = Pattern.compile(combine(ONLY_NUMBER));
    public static final Pattern NOT_ONLY_NUMBER_PATTERN = Pattern.compile(combine(NOT_ONLY_NUMBER));
    public static final Pattern ONLY_SPACE_PATTERN = Pattern.compile(combine(ONLY_SPACE));
    public static final Pattern NOT_ONLY_SPACE_PATTERN = Pattern.compile(combine(NOT_ONLY_SPACE));

    private static String combine(String pattern) {
        StringBuilder sb = new StringBuilder();

        return sb.append("^")
                .append("[")
                .append(pattern)
                .append("]")
                .append("+")
                .append("$")
                .toString();
    }

    public static boolean isCheck(Pattern pattern, String input) {
        return pattern.matcher(input).matches();
    }
}
