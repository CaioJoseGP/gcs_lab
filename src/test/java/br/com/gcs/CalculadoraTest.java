package br.com.gcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void testOperacoes() {
        Calculadora calc = new Calculadora();

        assertEquals(36.0, calc.somar(16, 20));
        assertEquals(0.0, calc.subtrair(10, 10));
    }

    @Test
    void testBhaskaraDuasRaizesReais() {
        Calculadora calc = new Calculadora();
        // x² - 5x + 6 = 0 -> raízes: x1 = 3.00, x2 = 2.00
        assertEquals("Soluções: 3.00 2.00", calc.bhaskara(1, -5, 6));
    }

    @Test
    void testBhaskaraRaizUnica() {
        Calculadora calc = new Calculadora();
        // x² - 4x + 4 = 0 -> raízes iguais: x1 = 2.00, x2 = 2.00 (delta = 0)
        assertEquals("Soluções: 2.00 2.00", calc.bhaskara(1, -4, 4));
    }

    @Test
    void testBhaskaraSemRaizesReais() {
        Calculadora calc = new Calculadora();
        // x² + 1x + 1 = 0 -> delta = -3 (delta < 0)
        assertEquals("Não há soluções reais", calc.bhaskara(1, 1, 1));
    }
}