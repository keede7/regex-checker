package io.keede7.pattern;

import io.keede7.pattern.model.SignupPatternTestModel;
import io.keede7.util.config.TestValidator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static io.keede7.pattern.model.SignupPatternTestModel.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author keede
 * Created on 2024/03/18
 */
class SignupPatternTestModelTests extends TestValidator {

    @Nested
    class EmailPattern {

        @Test
        void success() {

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
    }

    @Nested
    class UserIdPattern {
        final Pattern userIdPattern = USER_ID_PATTERN_FUNCTION.apply(new int[]{2, 8});

        @Test
        void success() {

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
        void fail() {

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

    @Nested
    class PhonePattern {
        @Test
        void success() {

            final String model1 = "010-2929-3833";
            final String model2 = "01029293833";
            final String model3 = "0192298333";

            assertAll(
                    () -> assertTrue(
                            isCheck(PHONE_PATTERN, model1)
                    ),
                    () -> assertTrue(
                            isCheck(PHONE_PATTERN, model2)
                    ),
                    () -> assertTrue(
                            isCheck(PHONE_PATTERN, model3)
                    )
            );
        }

        @Test
        void fail() {

            final String model1 = "010.2929.3833";
            final String model2 = "019293833";
            final String model3 = "01r2249833";
            final String model4 = "010229283$3";
            final String model5 = "0102%928333";

            assertAll(
                    () -> assertFalse(
                            isCheck(PHONE_PATTERN, model1)
                    ),
                    () -> assertFalse(
                            isCheck(PHONE_PATTERN, model2)
                    ),
                    () -> assertFalse(
                            isCheck(PHONE_PATTERN, model3)
                    ),
                    () -> assertFalse(
                            isCheck(PHONE_PATTERN, model4)
                    ),
                    () -> assertFalse(
                            isCheck(PHONE_PATTERN, model5)
                    )
            );
        }
    }

    @Nested
    class PasswordPattern {

        final Pattern userIdPattern = PASSWORD_PATTERN_FUNCTION.apply(new int[]{8, 16});

        @Test
        void success() {
            final String model1 = "9@3!$#@as2";
            final String model2 = "@1a!$#@as2";
            final String model3 = "@1A!$#@@#$";

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
        void fail() {
            final String model1 = "12#@aa";
            final String model2 = "11114444aaaa%%%%%";
            final String model3 = "testtest1212";
            final String model4 = "12123434%$%$";
            final String model5 = "testtest%$%$";
            final String model6 = "AASSFGGDS%$%$";
            final String model7 = "AASSFGGDS1212";

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

    @Nested
    class NicknamePattern {

        final Pattern nicknamePattern  = NICKNAME_PATTERN_FUNCTION.apply(new int[]{4, 12});

        @Test
        void success() {
            final String model1 = "test ";
            final String model2 = "test test";
            final String model3 = "209323";
            final String model4 = "239test";
            final String model5 = " 239 test ";

            assertAll(
                    () -> assertTrue(
                            isCheck(nicknamePattern, model1.trim())
                    ),
                    () -> assertTrue(
                            isCheck(nicknamePattern, model2.trim())
                    ),
                    () -> assertTrue(
                            isCheck(nicknamePattern, model3.trim())
                    ),
                    () -> assertTrue(
                            isCheck(nicknamePattern, model4.trim())
                    ),
                    () -> assertTrue(
                            isCheck(nicknamePattern, model5.trim())
                    )
            );
        }

        @Test
        void fail() {
            final String model1 = "test#@";
            final String model2 = "4324##";
            final String model3 = "%#$@%#$";
            final String model4 = "232";
            final String model5 = " 232 ";
            final String model6 = "3203929310222";

            assertAll(
                    () -> assertFalse(
                            isCheck(nicknamePattern, model1.trim())
                    ),
                    () -> assertFalse(
                            isCheck(nicknamePattern, model2.trim())
                    ),
                    () -> assertFalse(
                            isCheck(nicknamePattern, model3.trim())
                    ),
                    () -> assertFalse(
                            isCheck(nicknamePattern, model4.trim())
                    ),
                    () -> assertFalse(
                            isCheck(nicknamePattern, model5.trim())
                    ),
                    () -> assertFalse(
                            isCheck(nicknamePattern, model6.trim())
                    )
            );
        }
    }

    @Nested
    class BirthdayPrefixPattern {

        @Test
        void success() {
            final String model1 = "951006";

            assertAll(
                    () -> assertTrue(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model1)
                    )
            );
        }

        @Test
        void fail() {
            final String model1 = "95100";
            final String model2 = "95100A";
            final String model3 = "95100r";
            final String model4 = "95100 ";
            final String model5 = "95100$";
            final String model6 = "95100가";
            final String model7 = "95100ㄱ";

            assertAll(
                    () -> assertFalse(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model1)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model2)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model3)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model4)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model5)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model6)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_PREFIX_PATTERN, model7)
                    )
            );
        }
    }

    @Nested
    class BirthdaySuffixPattern {

        @Test
        void success() {
            final String model1 = "1020304";
            final String model2 = "2020304";
            final String model3 = "3020304";
            final String model4 = "4020304";

            assertAll(
                    () -> assertTrue(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model1)
                    ),
                    () -> assertTrue(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model2)
                    ),
                    () -> assertTrue(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model3)
                    ),
                    () -> assertTrue(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model4)
                    )
            );
        }

        @Test
        void fail() {
            final String model1 = "5102030";
            final String model2 = "510203";
            final String model3 = "a202030";
            final String model4 = "R394933";
            final String model5 = "#922399";
            final String model6 = "2@39494";
            final String model7 = "2d40404";
            final String model8 = "2R40404";
            final String model9 = "2ㄱ40404";
            final String model10 = "2가40404";

            assertAll(
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model1)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model2)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model3)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model4)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model5)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model6)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model7)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model8)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model9)
                    ),
                    () -> assertFalse(
                            isCheck(BIRTHDAY_SUFFIX_PATTERN, model10)
                    )
            );
        }
    }
}