package io.keede7.model.pattern;

import java.util.regex.Pattern;

import static io.keede7.model.expression.BasicCharacterExpression.*;

/**
* @author keede
* Created on 2024/03/08
*/
public final class BasicCharacterPattern {

    private static final Pattern ONLY_CHARACTER_PATTERN = Pattern.compile(ONLY_CHARACTER);
    private static final Pattern NOT_ONLY_CHARACTER_PATTERN = Pattern.compile(NOT_ONLY_CHARACTER);
    private static final Pattern ONLY_NUMBER_PATTERN = Pattern.compile(ONLY_NUMBER);
    private static final Pattern NOT_ONLY_NUMBER_PATTERN = Pattern.compile(NOT_ONLY_NUMBER);
    private static final Pattern ONLY_SPACE_PATTERN = Pattern.compile(ONLY_SPACE);
    private static final Pattern NOT_ONLY_SPACE_PATTERN = Pattern.compile(NOT_ONLY_SPACE);

}
