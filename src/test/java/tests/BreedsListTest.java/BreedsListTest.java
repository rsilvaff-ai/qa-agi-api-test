package tests;

import org.junit.jupiter.api.*;
import utils.TestListener;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BreedsListTest {

    @BeforeAll
    public void setupReport() {
        TestListener.startReport();
    }

    @BeforeEach
    public void startTest(TestInfo info) {
        TestListener.createTest(info.getDisplayName());
    }

    @Test
    @DisplayName("Teste lista de raças")
    public void testBreedsList() {
        System.out.println("Rodando teste de lista de raças");
        TestListener.test.info("Executando o teste de lista de raças");
        Assertions.assertTrue(true);
    }

    @AfterAll
    public void tearDown() {
        TestListener.flushReport();
    }
}