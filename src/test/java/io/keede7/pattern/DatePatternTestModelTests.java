package io.keede7.pattern;

import io.keede7.util.config.TestValidator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.keede7.pattern.model.DatePatternTestModel.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author keede
 * Created on 2024/04/01
 */
public class DatePatternTestModelTests extends TestValidator {

    @Nested
    class DatePatternWithDash {

        @Test
        void success() {
            final String model = "2024-03-31";

            assertAll(
                    () -> assertTrue(
                            isCheck(DATE_WITH_DASH_PATTERN, model)
                    )
            );
        }

        @Test
        void fail() {
            final String model1 = "202r-03-31";
            final String model2 = "2024-31";
            final String model3 = "2024-03";
            final String model4 = "2024-13-31";
            final String model5 = "2024-03-00";
            final String model6 = "2024-03-32";
            final String model7 = "2024/03/31";
            final String model8 = "2024.03.31";

            assertAll(
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model1)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model2)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model3)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model4)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model5)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model6)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model7)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DASH_PATTERN, model8)
                    )
            );
        }

    }

    @Nested
    class DatePatternWithSlash {

        @Test
        void success() {
            final String model = "2024/03/31";

            assertAll(
                    () -> assertTrue(
                            isCheck(DATE_WITH_SLASH_PATTERN, model)
                    )
            );
        }

        @Test
        void fail() {
            final String model1 = "202r/03/31";
            final String model2 = "2024/31";
            final String model3 = "2024/03";
            final String model4 = "2024/13/31";
            final String model5 = "2024/03/00";
            final String model6 = "2024/03/32";
            final String model7 = "2024-03-31";
            final String model8 = "2024.03.31";

            assertAll(
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model1)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model2)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model3)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model4)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model5)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model6)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model7)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_SLASH_PATTERN, model8)
                    )
            );
        }

    }

    @Nested
    class DatePatternWithDot {
        @Test
        void success() {
            final String model = "2024.03.31";

            assertAll(
                    () -> assertTrue(
                            isCheck(DATE_WITH_DOT_PATTERN, model)
                    )
            );
        }

        @Test
        void fail() {
            final String model1 = "202r.03.31";
            final String model2 = "2024.31";
            final String model3 = "2024.03";
            final String model4 = "2024.13.31";
            final String model5 = "2024.03.00";
            final String model6 = "2024.03.32";
            final String model7 = "2024-03-31";
            final String model8 = "2024/03/31";

            assertAll(
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model1)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model2)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model3)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model4)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model5)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model6)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model7)
                    ),
                    () -> assertFalse(
                            isCheck(DATE_WITH_DOT_PATTERN, model8)
                    )
            );
        }

    }
}
