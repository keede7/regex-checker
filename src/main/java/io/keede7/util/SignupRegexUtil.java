package io.keede7.util;

import io.keede7.util.config.Validator;

import java.util.regex.Pattern;

import static io.keede7.pattern.model.SignupPattern.*;

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
     * <p>
     * If the range is less than 2 characters, an exception is raised.
     * @param input
     * @param range
     * @return
     */
    public static boolean checkUserId(String input, int... range) {
        Pattern pattern = USER_ID_PATTERN_FUNCTION.apply(range);
        return isCheck(pattern, input);
    }

    /**
     * This is a function to check the mobile phone form.
     * <p>
     * The acceptable example format is 10 to 11 characters, and the separator is optional.
     * @param input
     * @return
     */
    public static boolean checkPhone(String input) {
        return isCheck(PHONE_PATTERN, input);
    }

    /**
     * This function checks the password.
     * It is a pattern that contains at least one letter, number, or special character, and the length can be specified directly.
     * @param input
     * @param range
     * @return
     */
    public static boolean checkPassword(String input, int... range) {
        Pattern pattern = PASSWORD_PATTERN_FUNCTION.apply(range);
        return isCheck(pattern, input);
    }

    /**
     * This is the function to change your nickname. Users can limit the length they wish to provide.
     * @param input
     * @param range
     * @return
     */
    public static boolean checkNickname(String input, int... range) {
        Pattern pattern = NICKNAME_PATTERN_FUNCTION.apply(range);
        return isCheck(pattern, input);
    }

}
