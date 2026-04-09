package tests;

import org.junit.jupiter.api.*;
import utils.TestListener;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RandomImageTest {

    @BeforeAll
    public void setupReport() {
        TestListener.startReport();
    }

    @BeforeEach
    public void startTest(TestInfo info) {
        TestListener.createTest(info.getDisplayName());
    }

    @Test
    @DisplayName("Teste imagem aleatória")
    public void testRandomImage() {
        System.out.println("Rodando teste de imagem aleatória");
        TestListener.test.info("Executando o teste de imagem aleatória");
        Assertions.assertTrue(true);
    }

    @AfterAll
    public void tearDown() {
        TestListener.flushReport();
    }
}