package io.keede7.util.config;

import java.util.regex.Pattern;

/**
 * @author keede
 * Created on 2024/03/15
 */
public abstract class Validator {
    protected static boolean isCheck(
            Pattern pattern,
            String input
    ) {
        return pattern.matcher(input).matches();
    }
}
