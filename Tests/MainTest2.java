import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {

    @Test
    void getprimesum() {
        int a=Main.getprimesum(100,10000);
        assertEquals(2973,a);
    }
}