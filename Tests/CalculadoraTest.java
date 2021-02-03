import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void calculo() {
        Calculadora calculadora = new Calculadora();
        //String exp = "123+*8-";
        String exp = "5 2 5 2 7 * * * *";
        String res = calculadora.Calculo(exp);
        assertEquals("Fallo en calculo", "700", res);
    }
}