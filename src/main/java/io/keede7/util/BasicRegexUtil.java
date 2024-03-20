package io.keede7.util;

import io.keede7.util.config.Validator;

import static io.keede7.pattern.model.BasicCharacterPattern.*;

/**
 * Patterns provided by default in regular expressions are defined.
 * @author keede
 * Created on 2024/03/15
 */
public final class BasicRegexUtil extends Validator {

    /**
     * This function only passes characters,
     * including upper and lower case letters and numbers.
     * @param input
     * @return
     */
    public static boolean isOnlyCharacter(String input) {
        return isCheck(ONLY_CHARACTER_PATTERN, input);
    }

    /**
     * This function only passes through non-character characters,
     * examples include Korean and special characters.
     * If uppercase or lowercase letters or numbers are entered, it fails.
     * @param input
     * @return
     */
    public static boolean isNotOnlyCharacter(String input) {
        return isCheck(NOT_ONLY_CHARACTER_PATTERN, input);
    }

    /**
     * This function only passes numbers. It will fail if other characters are included.
     * @param input
     * @return
     */
    public static boolean isOnlyNumber(String input) {
        return isCheck(ONLY_NUMBER_PATTERN, input);
    }

    /**
     * This function passes if it does not contain any numbers.
     * @param input
     * @return
     */
    public static boolean isNotContainNumber(String input) {
        return isCheck(NOT_ONLY_NUMBER_PATTERN, input);
    }

    /**
     * This function only passes spaces and tabs. It will fail if other characters are included.
     * @param input
     * @return
     */
    public static boolean isOnlySpace(String input) {
        return isCheck(ONLY_SPACE_PATTERN, input);
    }

    /**
     * This function passes if there are no spaces or tabs. If included, it fails.
     * @param input
     * @return
     */
    public static boolean isNotContainSpace(String input) {
        return isCheck(NOT_ONLY_SPACE_PATTERN, input);
    }

}
