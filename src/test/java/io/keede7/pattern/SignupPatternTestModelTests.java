package io.keede7.pattern;

import io.keede7.util.config.TestValidator;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static io.keede7.pattern.model.SignupPatternTestModel.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author keede
 * Created on 2024/03/18
 */
class SignupPatternTestModelTests extends TestValidator {

    @Test
    void emailPatternSuccessTest() {

        final String model1 = "weasq11@gmail.com";
        final String model2 = "weasq@gmail.com";
        final String model3 = "1293821@gmail.com";
        final String model4 = "1@gmail.com";
        final String model5 = "d@gmail.com";

        assertAll(
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, model1)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, model2)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, model3)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, model4)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, model5)
                )
        );
    }

    @Test
    void emailPatternFailTest() {

        final String model1 = "테스트@gmail.com";
        final String model2 = "테스트23@gmail.com";
        final String model3 = "@sdf@gmail.com";
        final String model4 = "sdf@gmailcom";
        final String model5 = "sdf@.com";
        final String model6 = "sdf@gamil.";

        assertAll(
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, model1)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, model2)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, model3)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, model4)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, model5)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, model6)
                )
        );

    }

    @Test
    void userIdPatternSuccessTest() {

        final Pattern userIdPattern = USER_ID_PATTERN_FUNCTION.apply(new int[]{2, 8});

        final String model1 = "sui21";
        final String model2 = "325123";
        final String model3 = "test";

        assertAll(
                () -> assertTrue(
                        isCheck(userIdPattern, model1)
                ),
                () -> assertTrue(
                        isCheck(userIdPattern, model2)
                ),
                () -> assertTrue(
                        isCheck(userIdPattern, model3)
                )
        );
    }

    @Test
    void userIdPatternFailTest() {

        final Pattern userIdPattern = USER_ID_PATTERN_FUNCTION.apply(new int[]{2, 8});

        final String model1 = "테스트";
        final String model2 = "jfkdsng3234";
        final String model3 = "2394324823";
        final String model4 = "testtesttest";
        final String model5 = "#@$#$";
        final String model6 = "t";
        final String model7 = "ㅎㄴㅇㄴ";

        assertAll(
                () -> assertFalse(
                        isCheck(userIdPattern, model1)
                ),
                () -> assertFalse(
                        isCheck(userIdPattern, model2)
                ),
                () -> assertFalse(
                        isCheck(userIdPattern, model3)
                ),
                () -> assertFalse(
                        isCheck(userIdPattern, model4)
                ),
                () -> assertFalse(
                        isCheck(userIdPattern, model5)
                ),
                () -> assertFalse(
                        isCheck(userIdPattern, model6)
                ),
                () -> assertFalse(
                        isCheck(userIdPattern, model7)
                )
        );
    }
}