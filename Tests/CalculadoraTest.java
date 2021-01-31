import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void calculo() {
        Calculadora calculadora = new Calculadora();
        //String exp = "123+*8-";
        String exp = "20/";
        String res = calculadora.Calculo(exp);
        assertEquals("Fallo en calculo", "-3.0", res);
    }
}