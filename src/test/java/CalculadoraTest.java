import org.junit.juniper.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void testOperacoes() {
        Calculadora calc = new Calculadora();

        assertEquals(36, calc.somar(16, 20));
        assertEquals(0, calc.subtrair(10, 10));
    }
}