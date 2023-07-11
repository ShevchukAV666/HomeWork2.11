package work.home.home_work_2_11.tests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import work.home.home_work_2_11.exceptions.NotParametersException;
import work.home.home_work_2_11.services.Calculator;
import work.home.home_work_2_11.services.CalculatorImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    void plusOneParameterAbsent() {

        String a = "8";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.plus(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void plusOneParameterAbsent2() {

        String a = "";
        String b = "2";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.plus(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void plusAllParametersAbsent() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.plus(a, b));
        assertEquals("Не указаны параметры для вычисления", exception.getMessage());
    }

    @Test
    void minusOneParameterAbsent() {

        String a = "8";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.minus(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void minusOneParameterAbsent2() {

        String a = "";
        String b = "2";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.minus(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void minusAllParametersAbsent() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.minus(a, b));
        assertEquals("Не указаны параметры для вычисления", exception.getMessage());
    }

    @Test
    void multiOneParameterAbsent() {

        String a = "8";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.multi(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void multiOneParameterAbsent2() {

        String a = "";
        String b = "2";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.multi(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void multiAllParametersAbsent() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.multi(a, b));
        assertEquals("Не указаны параметры для вычисления", exception.getMessage());
    }

    @Test
    void delenieOneParameterAbsent() {

        String a = "8";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.delenie(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void delenieOneParameterAbsent2() {

        String a = "";
        String b = "2";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.delenie(a, b));
        assertEquals("Введены не все необходимые данные", exception.getMessage());
    }

    @Test
    void delenieAllParametersAbsent() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotParametersException.class, () -> calculator.delenie(a, b));
        assertEquals("Не указаны параметры для вычисления", exception.getMessage());
    }

}


