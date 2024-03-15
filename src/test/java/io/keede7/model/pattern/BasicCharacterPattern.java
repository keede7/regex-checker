package io.keede7.model.pattern;

import io.keede7.model.BaseRegex;

import java.util.regex.Pattern;

/**
* @author keede
* Created on 2024/03/08
*/
public final class BasicCharacterPattern extends BaseRegex {

    public static final Pattern ONLY_CHARACTER_PATTERN = Pattern.compile(combine(BasicCharacterExpression.ONLY_CHARACTER));
    public static final Pattern NOT_ONLY_CHARACTER_PATTERN = Pattern.compile(combine(BasicCharacterExpression.NOT_ONLY_CHARACTER));
    public static final Pattern ONLY_NUMBER_PATTERN = Pattern.compile(combine(BasicCharacterExpression.ONLY_NUMBER));
    public static final Pattern NOT_ONLY_NUMBER_PATTERN = Pattern.compile(combine(BasicCharacterExpression.NOT_ONLY_NUMBER));
    public static final Pattern ONLY_SPACE_PATTERN = Pattern.compile(combine(BasicCharacterExpression.ONLY_SPACE));
    public static final Pattern NOT_ONLY_SPACE_PATTERN = Pattern.compile(combine(BasicCharacterExpression.NOT_ONLY_SPACE));

    private static final class BasicCharacterExpression {
        public static final String ONLY_CHARACTER = "[\\w]";
        public static final String NOT_ONLY_CHARACTER = "[\\W]";
        public static final String ONLY_NUMBER = "[\\d]";
        public static final String NOT_ONLY_NUMBER = "[\\D]";
        public static final String ONLY_SPACE = "[\\s]";
        public static final String NOT_ONLY_SPACE = "[\\S]";
    }
}
