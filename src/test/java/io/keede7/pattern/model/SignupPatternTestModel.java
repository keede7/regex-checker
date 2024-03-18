package io.keede7.pattern.model;

import io.keede7.util.config.TestBaseRegexUtils;

import java.util.function.Function;
import java.util.regex.Pattern;

/**
 * @author keede
 * Created on 2024/03/18
 */
public final class SignupPatternTestModel extends TestBaseRegexUtils {

    public static final Pattern EMAIL_PATTERN = Pattern.compile(combine(SignupPatternExpression.EMAIL));
    public static final Function<int[], Pattern> USER_ID_PATTERN_FUNCTION =
            range -> Pattern.compile(combineWithLength(range));

    private static final int MIN_LENGTH = 2;

    private static String combineWithLength(int... range) {
        if(range.length < MIN_LENGTH) {
            throw new RuntimeException("not enough range");
        }

        int min = range[0];
        int max = range[1];
        return combine(SignupPatternExpression.USER_ID + String.format("{%d,%d}", min, max));
    }

    private static final class SignupPatternExpression {
        public static final String EMAIL = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]";
        public static final String USER_ID = "[a-zA-Z0-9]";
    }

}
