package io.keede7.pattern;

import io.keede7.util.config.TestValidator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.keede7.pattern.model.BasicCharacterPatternTestModel.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author keede
 * Created on 2024/03/09
 */
public class BasicCharacterPatternTestModelTests extends TestValidator {

    @Nested
    class OnlyCharacterPattern {
        @Test
        void case_success() {

            final String model1 = "onlyCharacter";
            final String model2 = "1234";

            assertAll(
                    () -> {
                        assertTrue(
                                isCheck(
                                        ONLY_CHARACTER_PATTERN,
                                        model1
                                )
                        );
                        assertTrue(
                                isCheck(
                                        ONLY_CHARACTER_PATTERN,
                                        model2
                                )
                        );
                    }
            );
        }

        @Test
        void fail() {
            final String model1 = "테스트";
            final String model2 = "only테스트";
            final String model3 = "#@$@#";

            assertAll(
                    () -> {
                        assertFalse(
                                isCheck(
                                        ONLY_CHARACTER_PATTERN,
                                        model1
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_CHARACTER_PATTERN,
                                        model2
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_CHARACTER_PATTERN,
                                        model3
                                )
                        );
                    }
            );
        }
    }

    @Nested
    class NotOnlyCharacterPattern {
        @Test
        void success() {

            final String model1 = "테스트";
            final String model2 = "#@$@#";

            assertAll(
                    () -> {
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_CHARACTER_PATTERN,
                                        model1
                                )
                        );
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_CHARACTER_PATTERN,
                                        model2
                                )
                        );
                    }
            );
        }

        @Test
        void fail() {

            final String model1 = "onlyCharacter";
            final String model2 = "1234";

            assertAll(
                    () -> {
                        assertFalse(
                                isCheck(
                                        NOT_ONLY_CHARACTER_PATTERN,
                                        model1
                                )
                        );
                        assertFalse(
                                isCheck(
                                        NOT_ONLY_CHARACTER_PATTERN,
                                        model2
                                )
                        );
                    }
            );
        }
    }

    @Nested
    class OnlyNumberPattern {
        @Test
        void success() {

            final String model1 = "1234";

            assertAll(
                    () -> assertTrue(
                            isCheck(
                                    ONLY_NUMBER_PATTERN,
                                    model1
                            )
                    )
            );
        }

        @Test
        void fail() {

            final String model1 = "121테스트";
            final String model2 = "only1321";
            final String model3 = "#@$@#";
            final String model4 = "only";
            final String model5 = "테스트";

            assertAll(
                    () -> {
                        assertFalse(
                                isCheck(
                                        ONLY_NUMBER_PATTERN,
                                        model1
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_NUMBER_PATTERN,
                                        model2
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_NUMBER_PATTERN,
                                        model3
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_NUMBER_PATTERN,
                                        model4
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_NUMBER_PATTERN,
                                        model5
                                )
                        );
                    }
            );
        }
    }

    @Nested
    class NotOnlyNumberPattern {
        @Test
        void success() {

            final String model1 = "#@$@#";
            final String model2 = "only";
            final String model3 = "테스트";

            assertAll(
                    () -> {
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_NUMBER_PATTERN,
                                        model1
                                )
                        );
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_NUMBER_PATTERN,
                                        model2
                                )
                        );
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_NUMBER_PATTERN,
                                        model3
                                )
                        );
                    }
            );
        }

        @Test
        void fail() {

            final String model1 = "1234";
            final String model2 = "121테스트";
            final String model3 = "only1321";

            assertAll(
                    () -> {
                        assertFalse(
                                isCheck(
                                        NOT_ONLY_NUMBER_PATTERN,
                                        model1
                                )
                        );
                        assertFalse(
                                isCheck(
                                        NOT_ONLY_NUMBER_PATTERN,
                                        model2
                                )
                        );
                        assertFalse(
                                isCheck(
                                        NOT_ONLY_NUMBER_PATTERN,
                                        model3
                                )
                        );
                    }
            );
        }
    }

    @Nested
    class OnlySpacePattern {

        @Test
        void success() {

            final String model1 = " ";
            final String model2 = "\t";

            assertAll(
                    () -> {
                        assertTrue(
                                isCheck(
                                        ONLY_SPACE_PATTERN,
                                        model1
                                )
                        );
                        assertTrue(
                                isCheck(
                                        ONLY_SPACE_PATTERN,
                                        model2
                                )
                        );
                    }
            );
        }

        @Test
        void fail() {

            final String model1 = "1234";
            final String model2 = "121테스트";
            final String model3 = "only1321";

            assertAll(
                    () -> {
                        assertFalse(
                                isCheck(
                                        ONLY_SPACE_PATTERN,
                                        model1
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_SPACE_PATTERN,
                                        model2
                                )
                        );
                        assertFalse(
                                isCheck(
                                        ONLY_SPACE_PATTERN,
                                        model3
                                )
                        );
                    }
            );
        }
    }

    @Nested
    class NotOnlySpacePattern {

        @Test
        void success() {

            final String model1 = "1234";
            final String model2 = "121테스트";
            final String model3 = "only1321";

            assertAll(
                    () -> {
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_SPACE_PATTERN,
                                        model1
                                )
                        );
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_SPACE_PATTERN,
                                        model2
                                )
                        );
                        assertTrue(
                                isCheck(
                                        NOT_ONLY_SPACE_PATTERN,
                                        model3
                                )
                        );
                    }
            );
        }

        @Test
        void fail() {

            final String model1 = " ";
            final String model2 = "\t";

            assertAll(
                    () -> {
                        assertFalse(
                                isCheck(
                                        NOT_ONLY_SPACE_PATTERN,
                                        model1
                                )
                        );
                        assertFalse(
                                isCheck(
                                        NOT_ONLY_SPACE_PATTERN,
                                        model2
                                )
                        );
                    }
            );
        }
    }

}
