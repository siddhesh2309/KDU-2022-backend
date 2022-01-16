package homework5.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class JunitClass {

    @BeforeAll
    public void compare() {
        String str = "This is my first Junit Program";
        assertEquals("This is my first Junit Program", str);
    }
    @Test
    public void add() {
        Main addition = new Main();
        assertEquals(5, addition.add(2, 3));
    }
    @AfterAll
    public void multiply() {
        Main mul = new Main();
        assertEquals(20, mul.multiply(5, 4));
    }
    @BeforeEach
    public void subtraction() {
        Main sub = new Main();
        assertEquals(10, sub.subtraction(30, 20));
    }

}
