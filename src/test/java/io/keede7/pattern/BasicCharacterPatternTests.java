package io.keede7.pattern;

import io.keede7.util.Validator;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static io.keede7.pattern.model.BasicCharacterPattern.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author keede
 * Created on 2024/03/09
 */
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
public class BasicCharacterPatternTests extends Validator {

    @Test
    void onlyCharacterPatternTest() {

        final String successModel1 = "onlyCharacter";
        final String successModel2 = "1234";
        final String failModel1 = "테스트";
        final String failModel2 = "only테스트";
        final String failModel3 = "#@$@#";

        assertAll(
                () -> {
                    assertTrue(
                            isCheck(
                                    ONLY_CHARACTER_PATTERN,
                                    successModel1
                            )
                    );
                    assertTrue(
                            isCheck(
                                    ONLY_CHARACTER_PATTERN,
                                    successModel2
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_CHARACTER_PATTERN,
                                    failModel1
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_CHARACTER_PATTERN,
                                    failModel2
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_CHARACTER_PATTERN,
                                    failModel3
                            )
                    );
                }
        );

    }

    @Test
    void notOnlyCharacterPattern() {

        final String successModel1 = "테스트";
        final String successModel2 = "#@$@#";
        final String failModel1 = "onlyCharacter";
        final String failModel2 = "1234";

        assertAll(
                () -> {
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_CHARACTER_PATTERN,
                                    successModel1
                            )
                    );
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_CHARACTER_PATTERN,
                                    successModel2
                            )
                    );
                    assertFalse(
                            isCheck(
                                    NOT_ONLY_CHARACTER_PATTERN,
                                    failModel1
                            )
                    );
                    assertFalse(
                            isCheck(
                                    NOT_ONLY_CHARACTER_PATTERN,
                                    failModel2
                            )
                    );
                }
        );

    }

    @Test
    void onlyNumberPatternTest() {

        final String successModel1 = "1234";
        final String failModel1 = "121테스트";
        final String failModel2 = "only1321";
        final String failModel3 = "#@$@#";
        final String failModel4 = "only";
        final String failModel5 = "테스트";

        assertAll(
                () -> {
                    assertTrue(
                            isCheck(
                                    ONLY_NUMBER_PATTERN,
                                    successModel1
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_NUMBER_PATTERN,
                                    failModel1
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_NUMBER_PATTERN,
                                    failModel2
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_NUMBER_PATTERN,
                                    failModel3
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_NUMBER_PATTERN,
                                    failModel4
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_NUMBER_PATTERN,
                                    failModel5
                            )
                    );
                }
        );

    }

    @Test
    void notOnlyNumberPatternTest() {

        final String successModel1 = "#@$@#";
        final String successModel2 = "only";
        final String successModel3 = "테스트";
        final String failModel1 = "1234";
        final String failModel2 = "121테스트";
        final String failModel3 = "only1321";

        assertAll(
                () -> {
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_NUMBER_PATTERN,
                                    successModel1
                            )
                    );
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_NUMBER_PATTERN,
                                    successModel2
                            )
                    );
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_NUMBER_PATTERN,
                                    successModel3
                            )
                    );
                    assertFalse(
                            isCheck(
                                    NOT_ONLY_NUMBER_PATTERN,
                                    failModel1
                            )
                    );
                    assertFalse(
                            isCheck(
                                    NOT_ONLY_NUMBER_PATTERN,
                                    failModel2
                            )
                    );
                    assertFalse(
                            isCheck(
                                    NOT_ONLY_NUMBER_PATTERN,
                                    failModel3
                            )
                    );
                }
        );

    }

    @Test
    void onlySpacePatternTest() {

        final String successModel1 = " ";
        final String successModel2 = "\t";
        final String failModel1 = "1234";
        final String failModel2 = "121테스트";
        final String failModel3 = "only1321";

        assertAll(
                () -> {
                    assertTrue(
                            isCheck(
                                    ONLY_SPACE_PATTERN,
                                    successModel1
                            )
                    );
                    assertTrue(
                            isCheck(
                                    ONLY_SPACE_PATTERN,
                                    successModel2
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_SPACE_PATTERN,
                                    failModel1
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_SPACE_PATTERN,
                                    failModel2
                            )
                    );
                    assertFalse(
                            isCheck(
                                    ONLY_SPACE_PATTERN,
                                    failModel3
                            )
                    );
                }
        );

    }

    @Test
    void notOnlySpacePatternTest() {

        final String successModel1 = "1234";
        final String successModel2 = "121테스트";
        final String successModel3 = "only1321";
        final String failModel1 = " ";
        final String failModel2 = "\t";

        assertAll(
                () -> {
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_SPACE_PATTERN,
                                    successModel1
                            )
                    );
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_SPACE_PATTERN,
                                    successModel2
                            )
                    );
                    assertTrue(
                            isCheck(
                                    NOT_ONLY_SPACE_PATTERN,
                                    successModel3
                            )
                    );
                    assertFalse(
                            isCheck(
                                    NOT_ONLY_SPACE_PATTERN,
                                    failModel1
                            )
                    );
                    assertFalse(
                            isCheck(
                                    NOT_ONLY_SPACE_PATTERN,
                                    failModel2
                            )
                    );
                }
        );

    }
}
