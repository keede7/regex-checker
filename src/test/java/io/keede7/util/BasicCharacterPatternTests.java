package io.keede7.util;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static io.keede7.model.pattern.BasicCharacterPattern.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author keede
 * Created on 2024/03/09
 */
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
public class BasicCharacterPatternTests {

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
                            ONLY_CHARACTER_PATTERN
                                    .matcher(successModel1)
                                    .matches()
                    );
                    assertTrue(
                            ONLY_CHARACTER_PATTERN
                                    .matcher(successModel2)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_CHARACTER_PATTERN
                                    .matcher(failModel1)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_CHARACTER_PATTERN
                                    .matcher(failModel2)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_CHARACTER_PATTERN
                                    .matcher(failModel3)
                                    .matches()
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
                            NOT_ONLY_CHARACTER_PATTERN
                                    .matcher(successModel1)
                                    .matches()
                    );
                    assertTrue(
                            NOT_ONLY_CHARACTER_PATTERN
                                    .matcher(successModel2)
                                    .matches()
                    );
                    assertFalse(
                            NOT_ONLY_CHARACTER_PATTERN
                                    .matcher(failModel1)
                                    .matches()
                    );
                    assertFalse(
                            NOT_ONLY_CHARACTER_PATTERN
                                    .matcher(failModel2)
                                    .matches()
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
                            ONLY_NUMBER_PATTERN
                                    .matcher(successModel1)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_NUMBER_PATTERN
                                    .matcher(failModel1)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_NUMBER_PATTERN
                                    .matcher(failModel2)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_NUMBER_PATTERN
                                    .matcher(failModel3)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_NUMBER_PATTERN
                                    .matcher(failModel4)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_NUMBER_PATTERN
                                    .matcher(failModel5)
                                    .matches()
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
                            NOT_ONLY_NUMBER_PATTERN
                                    .matcher(successModel1)
                                    .matches()
                    );
                    assertTrue(
                            NOT_ONLY_NUMBER_PATTERN
                                    .matcher(successModel2)
                                    .matches()
                    );
                    assertTrue(
                            NOT_ONLY_NUMBER_PATTERN
                                    .matcher(successModel3)
                                    .matches()
                    );
                    assertFalse(
                            NOT_ONLY_NUMBER_PATTERN
                                    .matcher(failModel1)
                                    .matches()
                    );
                    assertFalse(
                            NOT_ONLY_NUMBER_PATTERN
                                    .matcher(failModel2)
                                    .matches()
                    );
                    assertFalse(
                            NOT_ONLY_NUMBER_PATTERN
                                    .matcher(failModel3)
                                    .matches()
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
                            ONLY_SPACE_PATTERN
                                    .matcher(successModel1)
                                    .matches()
                    );
                    assertTrue(
                            ONLY_SPACE_PATTERN
                                    .matcher(successModel2)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_SPACE_PATTERN
                                    .matcher(failModel1)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_SPACE_PATTERN
                                    .matcher(failModel2)
                                    .matches()
                    );
                    assertFalse(
                            ONLY_SPACE_PATTERN
                                    .matcher(failModel3)
                                    .matches()
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
                            NOT_ONLY_SPACE_PATTERN
                                    .matcher(successModel1)
                                    .matches()
                    );
                    assertTrue(
                            NOT_ONLY_SPACE_PATTERN
                                    .matcher(successModel2)
                                    .matches()
                    );
                    assertTrue(
                            NOT_ONLY_SPACE_PATTERN
                                    .matcher(successModel3)
                                    .matches()
                    );
                    assertFalse(
                            NOT_ONLY_SPACE_PATTERN
                                    .matcher(failModel1)
                                    .matches()
                    );
                    assertFalse(
                            NOT_ONLY_SPACE_PATTERN
                                    .matcher(failModel2)
                                    .matches()
                    );
                }
        );

    }

}
