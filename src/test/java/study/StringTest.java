package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    /**
     * 요구사항 1
     * "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
     * "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
     * 배열로 반환시 containsExactly  사용
     */
    @Test
    void splitByCommaTest() {
        String value = "1,2";
        String[] splitByComma = value.split(",");
        assertThat(splitByComma).containsExactly("1", "2");

        value = "1";
        splitByComma = value.split(",");
        assertThat(splitByComma).containsExactly("1");
        
    }

    /**
     * 요구사항 2
     * "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
     */
    @Test
    void subStringTest() {
        String value = "(1,2)";
        assertThat(value.substring(1,4)).isEqualTo("1,2");
    }

    /**
     * 요구사항 3
     * "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
     * String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
     * JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
     */
    @DisplayName("String 클래스의 charAt() 메소드 테스트 , 인덱스 값 벗어나면 예외처리")
    @Test
    void charAtTest() {
        String value = "abc";
        assertThat(value.charAt(0)).isEqualTo('a');
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    value.charAt(value.length());
                });
    }



}
