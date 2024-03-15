package io.keede7.model;

/**
 * @author keede
 * Created on 2024/03/15
 */
public abstract class BaseRegex {
    protected static String combine(String pattern) {
        StringBuilder sb = new StringBuilder();

        return sb.append("^")
                .append(pattern)
                .append("*")
                .append("$")
                .toString();
    }
}
