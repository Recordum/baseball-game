package baseballgameRefactorV1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PlaceValueTest {

    @Test
    void isEqualValue(){
        PlaceValue placeValue1 = new PlaceValue(2,1);
        PlaceValue placeValue2 = new PlaceValue(2, 3);
        assertThat(placeValue1.isEqualValue(placeValue2)).isTrue();


    }

    @Test
    void isEqualPlace(){
        PlaceValue placeValue1 = new PlaceValue(2,1);
        PlaceValue placeValue2 = new PlaceValue(1, 1);
        assertThat(placeValue1.isEqualPlace(placeValue2)).isTrue();
    }
}
