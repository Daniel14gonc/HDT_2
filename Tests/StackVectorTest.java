import org.junit.Test;

import static org.junit.Assert.*;

public class StackVectorTest {

    @Test
    public void push() {
        Stack<Integer> stack = new StackVector<Integer>();
        stack.push(2);
        assertEquals("Fallo en el push", Integer.valueOf(2), stack.peek());
    }

    @Test
    public void pop() {
        Stack<String> stack = new StackVector<String>();
        stack.push("p");
        assertEquals("Fallo en pop", "p", stack.pop());
    }

    @Test
    public void empty() {
        Stack<Double> stack = new StackVector<Double>();
        assertTrue("Fallo en empty", stack.empty());
    }
}