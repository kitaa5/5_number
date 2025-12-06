package testproject;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertThat(Calculator.sum(2, 2)).isEqualTo(4);
    }

    @Test
    public void testSubtract() {
        assertThat(Calculator.subtract(3,2)).isEqualTo(1);
    }

    @Test
    public void testSumWithZero() {
        assertThat(Calculator.sum(5, 0)).isEqualTo(5);
        assertThat(Calculator.sum(0, 5)).isEqualTo(5);
        assertThat(Calculator.sum(0, 0)).isEqualTo(0);
    }

    @Test
    public void testSumWithNegativeNumbers() {
        assertThat(Calculator.sum(-5, -3)).isEqualTo(-8);
        assertThat(Calculator.sum(-5, 3)).isEqualTo(-2);
        assertThat(Calculator.sum(5, -3)).isEqualTo(2);
    }

    @Test
    public void testSubtractWithZero() {
        assertThat(Calculator.subtract(5, 0)).isEqualTo(5);
        assertThat(Calculator.subtract(0, 5)).isEqualTo(-5);
        assertThat(Calculator.subtract(0, 0)).isEqualTo(0);
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        assertThat(Calculator.subtract(-5, -3)).isEqualTo(-2);
        assertThat(Calculator.subtract(-5, 3)).isEqualTo(-8);
        assertThat(Calculator.subtract(5, -3)).isEqualTo(8);
    }
}
