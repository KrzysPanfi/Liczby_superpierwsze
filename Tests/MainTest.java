import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void Testprime() {
        int testnum=3;
        boolean wynik;
       wynik=Main.isPrime(testnum);
       assertTrue(wynik);
    }
}