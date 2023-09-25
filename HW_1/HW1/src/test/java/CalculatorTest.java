import org.Task_1.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(2500, 10)).isEqualTo(2250);


        assertThatThrownBy(() -> Calculator.calculateDiscount(0, 25))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Purchase can't be zero or below");

        assertThatThrownBy(() -> Calculator.calculateDiscount(10000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Discount must be between 0 and 100.");

        assertThatThrownBy(() -> Calculator.calculateDiscount(12000, 199))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Discount must be between 0 and 100.");

        assertThatThrownBy(() -> Calculator.calculateDiscount(-10000, 70))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Purchase can't be zero or below");
    }


}
