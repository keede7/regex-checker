package io.keede7.util.config;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.util.regex.Pattern;

/**
 * @author keede
 * Created on 2024/03/15
 */
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
public abstract class TestValidator {
    protected boolean isCheck(
            Pattern pattern,
            String input
    ) {
        return pattern.matcher(input).matches();
    }
}
