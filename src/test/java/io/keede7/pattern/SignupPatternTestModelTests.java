package io.keede7.pattern;

import io.keede7.util.config.TestValidator;
import org.junit.jupiter.api.Test;

import static io.keede7.pattern.model.SignupPatternTestModel.EMAIL_PATTERN;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author keede
 * Created on 2024/03/18
 */
class SignupPatternTestModelTests extends TestValidator {

    @Test
    void emailPatternSuccessTest() {

        final String successModel1 = "weasq11@gmail.com";
        final String successModel2 = "weasq@gmail.com";
        final String successModel3 = "1293821@gmail.com";
        final String successModel4 = "1@gmail.com";
        final String successModel5 = "d@gmail.com";

        assertAll(
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, successModel1)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, successModel2)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, successModel3)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, successModel4)
                ),
                () -> assertTrue(
                        isCheck(EMAIL_PATTERN, successModel5)
                )
        );
    }

    @Test
    void emailPatternFailTest() {

        final String failModel1 = "테스트@gmail.com";
        final String failModel2 = "테스트23@gmail.com";
        final String failModel3 = "@sdf@gmail.com";
        final String failModel4 = "sdf@gmailcom";
        final String failModel5 = "sdf@.com";
        final String failModel6 = "sdf@gamil.";

        assertAll(
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, failModel1)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, failModel2)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, failModel3)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, failModel4)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, failModel5)
                ),
                () -> assertFalse(
                        isCheck(EMAIL_PATTERN, failModel6)
                )
        );

    }
}