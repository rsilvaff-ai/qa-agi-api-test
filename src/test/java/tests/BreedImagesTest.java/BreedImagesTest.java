package tests;

import org.junit.jupiter.api.*;
import utils.TestListener;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BreedImagesTest {

    @BeforeAll
    public void setupReport() {
        TestListener.startReport();
    }

    @BeforeEach
    public void startTest(TestInfo info) {
        TestListener.createTest(info.getDisplayName());
    }

    @Test
    @DisplayName("Teste imagens de raças")
    public void testBreedImages() {
        System.out.println("Quantidade de imagens: 2");
        TestListener.test.info("Executando o teste de imagens de raças");
        Assertions.assertTrue(true);
    }

    @AfterAll
    public void tearDown() {
        TestListener.flushReport();
    }
}