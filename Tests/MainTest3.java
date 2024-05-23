import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest3 {

    @Test
    void issumofsuperbaprime() {
        boolean a;
        a=Main.issumofsuperbaprime(100,10000);
        assertFalse(a);
    }
}