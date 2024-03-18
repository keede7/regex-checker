package io.keede7.pattern.model;

import io.keede7.util.config.TestBaseRegexUtils;

import java.util.regex.Pattern;

/**
 * @author keede
 * Created on 2024/03/18
 */
public final class SignupPatternTestModel extends TestBaseRegexUtils {

    public static final Pattern EMAIL_PATTERN = Pattern.compile(combine(SignupPatternExpression.EMAIL));

    private static final class SignupPatternExpression {

        public static final String EMAIL = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]";

    }

}
