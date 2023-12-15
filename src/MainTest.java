import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main test = new Main();

    @org.junit.jupiter.api.Test
    void sum() {
        Integer result = test.sum(5, 5);
        assertEquals(10, result, "il risultato dovrebbe essere 10");
    }

    @org.junit.jupiter.api.Test
    void sum_Con_Negativi() {
        Integer result = test.sum(-3, 5);
        assertEquals(2, result, "il risultato dovrebbe essere 2");
    }

    @org.junit.jupiter.api.Test
    void sum_con_null() {
        Integer result = test.sum(null, 5);
        assertNull(result, "se uno dei parametri è null lo sarà anche il risultato");
    }
}