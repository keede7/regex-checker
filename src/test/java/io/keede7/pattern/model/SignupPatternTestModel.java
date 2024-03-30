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
    public static final Pattern PHONE_PATTERN = Pattern.compile(combine(SignupPatternExpression.PHONE));
    public static final Pattern BIRTHDAY_PREFIX_PATTERN = Pattern.compile(combine(SignupPatternExpression.BIRTHDAY_PREFIX));
    public static final Pattern BIRTHDAY_SUFFIX_PATTERN = Pattern.compile(combine(SignupPatternExpression.BIRTHDAY_SUFFIX));
    public static final Function<int[], Pattern> PASSWORD_PATTERN_FUNCTION =
            range -> Pattern.compile(combineWithLength(SignupPatternExpression.PASSWORD, range));
    public static final Function<int[], Pattern> USER_ID_PATTERN_FUNCTION =
            range -> Pattern.compile(combineWithLength(SignupPatternExpression.USER_ID, range));
    public static final Function<int[], Pattern> NICKNAME_PATTERN_FUNCTION =
            range -> Pattern.compile(combineWithLength(SignupPatternExpression.NICKNAME, range));

    private static final int MIN_LENGTH = 2;

    private static String combineWithLength(String pattern, int... range) {
        if(range.length < MIN_LENGTH) {
            throw new RuntimeException("not enough range");
        }

        int min = range[0];
        int max = range[1];
        return combine(String.format("%s{%d,%d}", pattern, min, max));
    }

    private static final class SignupPatternExpression {
        public static final String EMAIL = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]";
        public static final String USER_ID = "[a-zA-Z0-9]";
        public static final String PHONE = "01[016789]-?([0-9]{3,4})-?([0-9]{4})";
        public static final String PASSWORD = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+])[A-Za-z0-9!@#$%^&*()_+]";
        public static final String NICKNAME = "[a-zA-Z0-9 ]";
        public static final String BIRTHDAY_PREFIX = "[0-9]{6}";
        public static final String BIRTHDAY_SUFFIX = "[1-4]{1}[0-9]{6}";
    }

}
