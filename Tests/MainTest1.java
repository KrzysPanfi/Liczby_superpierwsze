import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest1 {

    @Test
    void getCount() {
       int wynik=Main.getSuperBprimenubers(2,1000);
       assertEquals(693,wynik);
    }
}