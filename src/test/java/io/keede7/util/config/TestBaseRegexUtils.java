package io.keede7.util.config;

/**
 * @author keede
 * Created on 2024/03/15
 */
public abstract class TestBaseRegexUtils {

    protected static String combine(String pattern) {
        StringBuilder sb = new StringBuilder();

        return sb.append("^")
                .append(pattern)
                .append("+")
                .append("$")
                .toString();
    }
}
