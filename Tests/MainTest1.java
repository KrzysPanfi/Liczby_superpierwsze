import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest1 {

    @Test
    void getCount() {
       ArrayList<Integer>wynik=Main.getSuperBprimenubers(2,1000);
       assertEquals(693,wynik.size());
    }
}