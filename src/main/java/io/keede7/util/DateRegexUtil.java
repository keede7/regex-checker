package io.keede7.util;

import io.keede7.util.config.Validator;

import static io.keede7.pattern.model.DatePattern.*;

/**
 * Regular expressions related to 'Date' are provided.
 * @author keede
 * Created on 2024/04/02
 */
public class DateRegexUtil extends Validator {

    /**
     * This function checks the date format.
     * <p>
     * The combination expression is xxxx-xx-xx, and the date format using the `-` separator is checked.
     * @param input
     * @return
     */
    public static boolean checkDateWithDash(String input) {
        return isCheck(DATE_WITH_DASH_PATTERN, input);
    }

    /**
     * This function checks the date format.
     * <p>
     * The combination expression is xxxx/xx/xx, and the date format using the `/` separator is checked.
     * @param input
     * @return
     */
    public static boolean checkDateWithSlash(String input) {
        return isCheck(DATE_WITH_SLASH_PATTERN, input);
    }

    /**
     * This function checks the date format.
     * <p>
     * The combination expression is xxxx.xx.xx, and the date format using the `.` separator is checked.
     * @param input
     * @return
     */
    public static boolean checkDateWithDot(String input) {
        return isCheck(DATE_WITH_DOT_PATTERN, input);
    }

}
