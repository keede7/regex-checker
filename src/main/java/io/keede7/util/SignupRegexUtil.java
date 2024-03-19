package io.keede7.util;

import io.keede7.util.config.Validator;

import java.util.regex.Pattern;

import static io.keede7.pattern.model.SignupPattern.EMAIL_PATTERN;
import static io.keede7.pattern.model.SignupPattern.USER_ID_PATTERN_FUNCTION;

/**
 * Regular expressions related to 'Sign up' are provided.
 * @author keede
 * Created on 2024/03/19
 */
public final class SignupRegexUtil extends Validator {

    /**
     * Check your email format.
     * @param input
     * @return
     */
    public static boolean checkEmail(String input) {
        return isCheck(EMAIL_PATTERN, input);
    }

    /**
     * The user ID format is checked and the range can be set arbitrarily.
     * Allowed formats - numbers, English upper and lower case letters.
     * If the range is less than 2 characters, an exception is raised.
     * @param input
     * @param range
     * @return
     */
    public static boolean checkUserId(String input, int... range) {
        Pattern pattern = USER_ID_PATTERN_FUNCTION.apply(range);
        return isCheck(pattern, input);
    }

}
