package io.keede7.pattern.model;

import io.keede7.util.config.BaseRegexUtils;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @author keede
 * Created on 2024/04/02
 */
public class DatePattern extends BaseRegexUtils {

    public static final Pattern DATE_WITH_DASH_PATTERN = compile(combine(Expression.DATE_DELIMITER_TYPE_DASH));
    public static final Pattern DATE_WITH_SLASH_PATTERN = compile(combine(Expression.DATE_DELIMITER_TYPE_SLASH));
    public static final Pattern DATE_WITH_DOT_PATTERN = compile(combine(Expression.DATE_DELIMITER_TYPE_DOT));

    private static final class Expression {
        public static final String DATE_DELIMITER_TYPE_DASH = "[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
        public static final String DATE_DELIMITER_TYPE_SLASH = "[0-9]{4}\\/(0[1-9]|1[0-2])\\/(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
        public static final String DATE_DELIMITER_TYPE_DOT = "[0-9]{4}\\.(0[1-9]|1[0-2])\\.(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
    }

}
