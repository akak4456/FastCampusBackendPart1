package com.adele;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class UserTest {
    
    @DisplayName("패스워드 초기화한다.")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
        // RandomPasswordGenerator BufferedOverflowException 같은 경우
        // 비밀번호가 7자 이하일때 발생하는 현상으로 보임
        user.initPassword(() -> "abcdefgh");

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        // RandomPasswordGenerator BufferedOverflowException 같은 경우
        // 비밀번호가 7자 이하일때 발생하는 현상으로 보임
        user.initPassword(() -> "ab");

        // then
        assertThat(user.getPassword()).isNull();
    }
}